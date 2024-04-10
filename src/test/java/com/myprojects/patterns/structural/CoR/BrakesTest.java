package com.myprojects.patterns.structural.CoR;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class BrakesTest {

    @Test
    void testBrakesInstall() {
        AssemblyLine assemblyLine = new Brakes();
        assemblyLine.install(new Component(
                "brakes",
                100,
                50,
                20,
                5000.0,
                "Transmission description"));


        assertTrue(Objects.isNull(assemblyLine.assemblyLine));
    }

    @Test
    void testBrakesInstallWhenNextStep() {
        AssemblyLine assemblyLine = new Brakes();
        assemblyLine.install(new Component(
                "suspension",
                100,
                50,
                20,
                5000.0,
                "description"));

        assertAll(
                () -> assertTrue(Objects.nonNull(assemblyLine.assemblyLine)),
                () -> assertInstanceOf(Suspension.class, assemblyLine.assemblyLine)
        );
    }
}
