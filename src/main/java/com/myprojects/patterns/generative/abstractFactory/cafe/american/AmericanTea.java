package com.myprojects.patterns.generative.abstractFactory.cafe.american;

public class AmericanTea implements American {

    public void getBlackTea() { System.out.println("Client order black tea"); }

    public void getGreenTea() { System.out.println("Client order green tea"); }

    public void getGoodOldLemonTea() { System.out.println("Client order \"good old lemon tea\""); }

    @Override
    public void customerOrderInAmericanCafe() { System.out.println("American order tea"); }
}
