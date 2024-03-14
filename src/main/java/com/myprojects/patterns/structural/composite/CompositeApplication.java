package com.myprojects.patterns.structural.composite;

public class CompositeApplication {
    public static void main(String[] args) {
        Composite aircraft = new Composite();

        Composite compositeAircraft = new Composite();
        Component tail = new Component(100, 50, 20, 5000.0, "Tail component");
        Component landingGear = new Component(200, 30, 10, 7000.0, "Landing gear component");
        compositeAircraft.addComponent(tail);
        compositeAircraft.addComponent(landingGear);

        Composite leafAircraft = new Composite();
        Component avionics = new Component(50, 10, 5, 3000.0, "Avionics component");
        leafAircraft.addComponent(avionics);

        aircraft.addComponent(compositeAircraft);
        aircraft.addComponent(leafAircraft);

        System.out.println("Price: " + aircraft.getPrice());
        System.out.println("Weight: " + aircraft.getWeight());
    }
}
