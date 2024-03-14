package com.myprojects.patterns.structural.CoR;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Interior extends AssemblyLine {
    public Interior() {
        super();
    }

    @Override
    void install(Component component) {
        if (component.type().equals("interior")) {
            log.warn("Interior installation");
        } else {
            this.setNext(new Interior(), component);
        }
    }
}
