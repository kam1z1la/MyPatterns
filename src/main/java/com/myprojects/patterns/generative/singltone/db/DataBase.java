package com.myprojects.patterns.generative.singltone.db;

public enum DataBase {
    URL {
        @Override
        public String get() {
            return "jdbc:h2:./src/main/resources/db/Note;MODE=PostgreSQL;";
        }
    },
    NAME {
        @Override
        public String get() {
            return "sa";
        }
    },
    PASSWORD {
        @Override
        public String get() {
            return "sa";
        }
    };

    public abstract String get();
}
