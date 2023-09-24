package com.myprojects.patterns.generative.abstractFactory;

/* a��������� ������� ���� (������� ������������, �����������, ��������
        �������� ����, ���, ��������)
        */

import com.myprojects.patterns.generative.abstractFactory.cafe.CafeProvider;
import com.myprojects.patterns.generative.abstractFactory.cafe.american.AmericanCafeFactory;
import com.myprojects.patterns.generative.abstractFactory.cafe.american.AmericanCoffee;
import com.myprojects.patterns.generative.abstractFactory.cafe.eastern.EasternCafeFactory;
import com.myprojects.patterns.generative.abstractFactory.cafe.eastern.EasternCoffee;
import com.myprojects.patterns.generative.abstractFactory.cafe.european.EuropeanCafeFactory;
import com.myprojects.patterns.generative.abstractFactory.cafe.european.EuropeanCoffee;

import static com.myprojects.patterns.generative.abstractFactory.enums.TypeCafe.*;
import static com.myprojects.patterns.generative.abstractFactory.enums.TypeProduct.COFFEE;

public class AbstractFactoryApplication {

    public static void main(String[] args) {
        AmericanCafeFactory american = (AmericanCafeFactory) new CafeProvider().createFactory(AMERICAN);
        AmericanCoffee americanCoffee = (AmericanCoffee) american.create(COFFEE);

        americanCoffee.customerOrderInAmericanCafe();
        americanCoffee.getAmericano();
        americanCoffee.getCappuccino();
        americanCoffee.getLatte();

        EasternCafeFactory eastern = (EasternCafeFactory) new CafeProvider().createFactory(EASTERN);
        EasternCoffee easternCoffee = (EasternCoffee) eastern.create(COFFEE);

        easternCoffee.customerOrderInEasternCafe();
        easternCoffee.getCappuccino();
        easternCoffee.getEspresso();
        easternCoffee.getMacchiato();

        EuropeanCafeFactory european = (EuropeanCafeFactory) new CafeProvider().createFactory(EUROPEAN);
        EuropeanCoffee europeanCoffee = (EuropeanCoffee) european.create(COFFEE);

        europeanCoffee.customerOrderInEuropeanCafe();
        europeanCoffee.getBlackCoffee();
        europeanCoffee.getTurkishCoffee();
        europeanCoffee.getMocha();
    }

}
