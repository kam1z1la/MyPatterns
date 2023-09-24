package com.myprojects.patterns.generative.abstractFactory.cafe.eastern;

public class EasternSweats implements Eastern {

    public void getCroissants() { System.out.println("Client order croissants"); }

    public void getTiramisu() { System.out.println("Client order tiramisu"); }

    public void getClassicChocolate() { System.out.println("Client order classic chocolate"); }

    @Override
    public void customerOrderInEasternCafe() { System.out.println("Eastern client order sweats"); }
}
