package com.myprojects.patterns.generative.abstractFactory.cafe.american;

public class AmericanSweats implements American {

    public void getMuffins() { System.out.println("Client order black muffins"); }

    public void getDonuts() { System.out.println("Client order green donuts"); }

    public void getVanillaCupcakes() { System.out.println("Client order vanilla cupcakes"); }

    @Override
    public void customerOrderInAmericanCafe() { System.out.println("American order sweats"); }
}
