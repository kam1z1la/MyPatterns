package com.myprojects.patterns.generative.abstractFactory.cafe.american;

public class AmericanCoffee implements American {

    public void getAmericano() { System.out.println("Client order americano"); }

    public void getCappuccino() { System.out.println("Client order cappuccino"); }

    public void getLatte() { System.out.println("Client order latte"); }

    @Override
    public void customerOrderInAmericanCafe() { System.out.println("American order coffee"); }
}
