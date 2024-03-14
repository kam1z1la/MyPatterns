package com.myprojects.patterns.structural.CoR;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Engine extends AssemblyLine {

    public Engine() {
        super();
    }

    @Override
    void install(Component component) {
        if (component.type().equals("engine")) {
            log.warn("Engine installation");
        } else {
            this.setNext(new Transmission(), component);
        }
    }
}
