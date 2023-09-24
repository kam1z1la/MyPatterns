package com.myprojects.patterns.generative.abstractFactory.cafe.eastern;

public class EasternCoffee implements Eastern {

    public void getEspresso() { System.out.println("Client order espresso"); }

    public void getCappuccino() { System.out.println("Client order green english cappuccino"); }

    public void getMacchiato() { System.out.println("Client order macchiato"); }


    @Override
    public void customerOrderInEasternCafe() { System.out.println("Eastern client order coffee"); }
}
