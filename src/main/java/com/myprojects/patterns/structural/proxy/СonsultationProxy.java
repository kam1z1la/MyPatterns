package com.myprojects.patterns.structural.proxy;

public class СonsultationProxy implements Сonsultation {
    private final Сonsultant consultant;

    public СonsultationProxy() {
        this.consultant = new Сonsultant("Ольга", "+380123456789", true);
    }

    @Override
    public String giveResponseToUser(String query) {
        switch (query) {
            case "How to open an account?" -> {
                return  "To open an account, you need to contact our branch with your passport and personal identification number.";
            }
            case "How to get a loan?" -> {
                return  "To get a loan, you need to fill out an application and submit the necessary documents to the bank.";
            }
            default -> {
                return consultant.giveResponseToUser(query);
            }
        }
    }
}
