package com.myprojects.patterns.generative.abstractFactory.cafe.european;

public class EuropeanTea implements European {

    public void getBlackTea() { System.out.println("Client order black tea"); }

    public void getGingerTea() { System.out.println("Client order ginger tea"); }

    public void getBlackTeaWithLemon() { System.out.println("Client order black tea with lemon"); }

    @Override
    public void customerOrderInEuropeanCafe() { System.out.println("European order tea"); }

}
