package com.myprojects.patterns.behaviorall.strategy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;

@Slf4j
public class RichTextFormatDocument implements Document {

    @Override
    public void create(String path) {
        File file = new File(path +"richTextFormat.rtf");
        try {
            if (file.createNewFile()) {
                log.info(file.getName());
            } else {
                log.warn(file.getName());
            }
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }
}
