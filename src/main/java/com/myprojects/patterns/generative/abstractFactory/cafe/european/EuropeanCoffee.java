package com.myprojects.patterns.generative.abstractFactory.cafe.european;

public class EuropeanCoffee implements European {

    public void getTurkishCoffee() { System.out.println("Client order turkish coffee"); }

    public void getMocha() { System.out.println("Client order green mocha"); }

    public void getBlackCoffee() { System.out.println("Client order black coffee"); }

    @Override
    public void customerOrderInEuropeanCafe() { System.out.println("European order coffee"); }
}
