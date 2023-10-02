package com.myprojects.patterns.generative.singltone.logger;

import com.myprojects.patterns.generative.singltone.Report;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static volatile Logger instance;
    private static volatile Report report;

    private Logger() {}

    public static Logger log(){
        if (instance == null){
            synchronized (Logger.class) {
                if(instance == null) {
                    instance = new Logger();
                    report = new Report();
                }
            }
        }
        return instance;
    }

    public void info(String message) {
        String log = getZonedDateTime() + " INFO 1914: " + message;
        report.addLog(log);
        System.out.println(log);
    }

    public void info(String message, Object object) {
        String log = getZonedDateTime() + " INFO 1914: " + message + object;
        report.addLog(log);
        System.out.println(log);
    }

    public void error(String message, Exception exception) {
        String log = getZonedDateTime() + " ERROR 1914: " + message + "\n" + exception;
        report.addLog(log);
        System.out.println(log);
    }

    public void error(String message) {
        String log = getZonedDateTime() + " ERROR 1914: " + message;
        report.addLog(log);
        System.out.println(log);
    }

    public void trace(String message, Object object) {
        String log = getZonedDateTime() + " TRACE 1914: " + message + object;
        report.addLog(log);
        System.out.println(log);
    }

    public void warn(String message) {
        String log = getZonedDateTime() + " WARN 1914: " + message;
        report.addLog(log);
        System.out.println(log);
    }

    private String getZonedDateTime() {
        return ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS XXX"));
    }

}
