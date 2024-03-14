package com.myprojects.patterns.structural.CoR;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Brakes extends AssemblyLine {
    public Brakes() {
        super();
    }

    @Override
    void install(Component component) {
        if (component.type().equals("brakes")) {
           log.warn("Brakes installation");
        } else {
            this.setNext(new Suspension(), component);
        }
    }
}
