package com.myprojects.patterns.generative.abstractFactory.cafe.european;

public class EuropeanSweats implements European {

    public void getBaklava() { System.out.println("Client order baklava"); }

    public void getHoneyCake() { System.out.println("Client order honey cake"); }

    public void getCharlotte() { System.out.println("Client order charlotte"); }

    @Override
    public void customerOrderInEuropeanCafe() { System.out.println("European order sweats"); }

}
