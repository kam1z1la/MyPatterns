package com.myprojects.patterns.generative.abstractFactory.cafe.eastern;

public class EasternTea implements Eastern {

    public void getEarlGrey() { System.out.println("Client order earl grey"); }

    public void getEnglishBreakfast() { System.out.println("Client order green english breakfast"); }

    public void getMintTea() { System.out.println("Client order mint tea"); }

    @Override
    public void customerOrderInEasternCafe() { System.out.println("Eastern client order tea"); }
}
