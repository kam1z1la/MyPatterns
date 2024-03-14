package com.myprojects.patterns.structural.CoR;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class SuspensionTest {

    @Test
    void testSuspensionInstall() {
        AssemblyLine assemblyLine = new Suspension();
        assemblyLine.install(new Component(
                "suspension",
                100,
                50,
                20,
                5000.0,
                "Transmission description"));


        assertTrue(Objects.isNull(assemblyLine.assemblyLine));
    }

    @Test
    void testInstallWhenNextStep() {
        AssemblyLine assemblyLine = new Suspension();
        assemblyLine.install(new Component(
                "engine",
                100,
                50,
                20,
                5000.0,
                "description"));


        assertAll(
                () -> assertTrue(Objects.nonNull(assemblyLine.assemblyLine)),
                () -> assertInstanceOf(Engine.class, assemblyLine.assemblyLine)
        );
    }
}