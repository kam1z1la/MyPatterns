package com.myprojects.patterns.behaviorall.observer;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Builder
public class Сustomer implements Advertising {
    private String name;
    private String phoneNumber;
    private String email;

    @Override
    public void update(String advertising) {
        log.info(advertising);
    }
}
