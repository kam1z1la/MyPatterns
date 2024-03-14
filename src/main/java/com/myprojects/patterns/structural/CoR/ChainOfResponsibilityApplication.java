package com.myprojects.patterns.structural.CoR;

public class ChainOfResponsibilityApplication {
    public static void main(String[] args) {
        Component transmission = new Component(
                "transmission",
                100,
                50,
                20,
                5000.0,
                "Transmission description");

        AssemblyLine assemblyLine = new Suspension();
        assemblyLine.install(transmission);
    }
}
