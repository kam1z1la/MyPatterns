package com.myprojects.patterns.generative.singltone.note;

import com.myprojects.patterns.generative.singltone.db.Manager;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static com.myprojects.patterns.generative.singltone.logger.Logger.log;

public class NoteService implements Repository<Note, Long> {

    @Override
    public Note findById(Long id) {
        String query = "select * from note where id = ?;";
        Connection connection = Manager.INSTANCE.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Note note = Note.builder()
                        .id(resultSet.getLong("id"))
                        .title(resultSet.getString("title"))
                        .content(resultSet.getString("content"))
                        .access(resultSet.getString("title"))
                        .build();

                log().trace("ID found", note);
                return note;
            } else {
                log().warn("ID not found");
                return null;
            }

        } catch (SQLException e) {
            log().error("problem finding data by ID", e);
            throw new RuntimeException();
        } finally {
            Manager.INSTANCE.closeConnection(connection);
        }
    }

    @Override
    public List<Note> findAll() {
        Connection connection = Manager.INSTANCE.getConnection();
        try (Statement statement = connection.createStatement()) {
            List<Note> notes = getListRequest(statement.executeQuery("select * from note;"));
            log().trace("List of all records in the table", notes);
            return notes;
        } catch (SQLException e) {
            log().error("problem with displaying all data");
            throw new RuntimeException(e);
        } finally {
            Manager.INSTANCE.closeConnection(connection);
        }
    }

    @Override
    public void insert(Note note) {
        String query = "insert into note (title, content, access) values (?, ?, ?);";
        Connection connection = Manager.INSTANCE.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            connection.setAutoCommit(false);

            statement.setString(1, note.getTitle());
            statement.setString(2, note.getContent());
            statement.setString(3, note.getAccess());
            statement.addBatch();

            statement.executeBatch();
            connection.commit();
            log().info("Data added successfully: ", note);
        } catch (SQLException e) {
            log().error("Problem with added data");
            throw new RuntimeException(e);
        } finally {
            Manager.INSTANCE.closeConnection(connection);
        }
    }

    @Override
    public void deleteById(Long id) {
        String query = "delete from note where id = ?;";
        Connection connection = Manager.INSTANCE.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            connection.setAutoCommit(false);
            statement.setLong(1, id);

            if (isIdExists(id)) {
                statement.executeUpdate();
                connection.commit();
                log().info("Data delete by id successfully");
            } else {
                log().error("Id doesn't exist: ", new IllegalArgumentException());
            }

        } catch (SQLException e) {
            log().error("Problem with delete by id data");
            throw new RuntimeException(e);
        } finally {
            Manager.INSTANCE.closeConnection(connection);
        }
    }

    @Override
    public void deleteAll() {
        Connection connection = Manager.INSTANCE.getConnection();
        try (Statement statement = connection.createStatement()) {
            connection.setAutoCommit(false);
            statement.executeQuery("delete from note;");
            connection.commit();
            log().info("Successful clearing of the entire table");
        } catch (SQLException e) {
            log().error("Problem with clearing the entire table");
            throw new RuntimeException(e);
        } finally {
            Manager.INSTANCE.closeConnection(connection);
        }
    }

    @Override
    public void update(Note note) {
        String query = "update note set title = ?, content = ?, access = ? where id = ?;";
        Connection connection = Manager.INSTANCE.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            connection.setAutoCommit(false);

            if (isIdExists(note.getId())) {
                statement.setString(1, note.getTitle());
                statement.setString(2, note.getContent());
                statement.setString(3, note.getAccess());
                statement.setLong(4, note.getId());
                statement.executeUpdate();
                connection.commit();
                log().info("Data update successfully");
            } else {
                log().error("Id doesn't exist: ", new IllegalArgumentException());
            }

        } catch (SQLException e) {
            log().error("Problem with update data");
            throw new RuntimeException(e);
        } finally {
            Manager.INSTANCE.closeConnection(connection);
        }
    }

    private boolean isIdExists(Long id) {
        String query = "select id from note where id = ?;";
        Connection connection = Manager.INSTANCE.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            log().error("Problem with find data by id ", e);
            throw new RuntimeException();
        } finally {
            Manager.INSTANCE.closeConnection(connection);
        }
    }

    private List<Note> getListRequest(ResultSet resultSet) {
        try {
            List<Note> notes = new LinkedList<>();
            while (resultSet.next()) {
                Note note = Note.builder()
                        .id(resultSet.getLong("id"))
                        .title(resultSet.getString("title"))
                        .content(resultSet.getString("content"))
                        .access(resultSet.getString("title"))
                        .build();

                notes.add(note);
            }
            return notes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
