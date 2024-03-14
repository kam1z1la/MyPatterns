package com.myprojects.patterns.structural.CoR;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Suspension extends AssemblyLine {

    public Suspension() {
        super();
    }

    @Override
    void install(Component component) {
        if (component.type().equals("suspension")) {
            log.warn("Suspension installation");
        } else {
            this.setNext(new Engine(), component);
        }
    }
}
