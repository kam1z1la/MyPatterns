package com.myprojects.patterns.generative.singltone.db;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.output.MigrateResult;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.myprojects.patterns.generative.singltone.logger.Logger.log;


public enum Manager {
    INSTANCE;

    public Connection getConnection() {
        try {
            log().info("Database connection");
            return DriverManager.getConnection(DataBase.URL.get(), DataBase.NAME.get(), DataBase.PASSWORD.get());
        } catch (SQLException e) {
            log().error("Close connection problems", e);
            throw new RuntimeException();
        }
    }

    public void closeConnection(Connection connection) {
        try {
            if(!connection.getAutoCommit()) {
                connection.setAutoCommit(true);
            }
            connection.close();
            log().info("Database connection close");
        } catch (SQLException e) {
            log().error("Close connection problems", e);
            throw new RuntimeException();
        }
    }

    public void startMigration() {
        MigrateResult migrate = Flyway.configure()
                .locations("classpath:db/migration")
                .dataSource(DataBase.URL.get(), DataBase.NAME.get(), DataBase.PASSWORD.get())
                .load()
                .migrate();

        log().info("Start migration success: ", migrate.success);
    }
}
