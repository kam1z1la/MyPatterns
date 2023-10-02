package com.myprojects.patterns.generative.singltone;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Report {

    private final String fileName;

    public Report() {
        this.fileName = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd__HH.mm.ss")) + ".txt";
    }

    private FileWriter isFileExists() {
        Path path = Paths.get("src/main/resources/reports/" + fileName);
        try {
            if (Files.exists(path)) {
                return new FileWriter(path.toFile(), true);
            } else {
                return new FileWriter("src/main/resources/reports/" + fileName);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addLog(String log) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(isFileExists())) {
            bufferedWriter.write(log);
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
