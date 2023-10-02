package com.myprojects.patterns.generative.singltone;

import com.myprojects.patterns.generative.singltone.db.Manager;
import com.myprojects.patterns.generative.singltone.note.Access;
import com.myprojects.patterns.generative.singltone.note.Note;
import com.myprojects.patterns.generative.singltone.note.NoteService;

public class SingleToneApplication {

    public static void main(String[] args) {
        Manager.INSTANCE.startMigration();

        NoteService noteService = new NoteService();

        noteService.findAll();

        noteService.insert(Note.builder()
                .title("test")
                .content("test")
                .access(Access.PUBLIC.name())
                .build());

        noteService.findById(5L);
        noteService.deleteById(5L);
        noteService.findById(5L);

        noteService.findAll();
    }
}
