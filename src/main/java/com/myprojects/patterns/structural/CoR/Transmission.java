package com.myprojects.patterns.structural.CoR;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Transmission extends AssemblyLine {
    public Transmission() {
        super();
    }

    @Override
    void install(Component component) {
        if (component.type().equals("transmission")) {
            log.warn("Transmission installation");
        } else {
            this.setNext(new Interior(), component);
        }
    }
}
