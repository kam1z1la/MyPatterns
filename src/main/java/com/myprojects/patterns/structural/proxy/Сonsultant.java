package com.myprojects.patterns.structural.proxy;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class Сonsultant implements Сonsultation {
    private String name;
    private String phoneNumber;
    private long consultationTime;
    private boolean available;

    public Сonsultant(String name, String phoneNumber, boolean available) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.consultationTime = System.currentTimeMillis();
        this.available = available;
    }

    public String startConsultation() {
        log.info("Сonsultant join to chat");
        return String.format("Добрий день! Вас вітає %s! Чим можемо Вам допомогти?", name);
    }

    public String endConsultation() {
        log.info("Сonsultant end the chat, Time: " + getConsultationTime());
        return "До побачення! Не соромтесь звертатися, якщо у вас виникнуть ще питання!";
    }

    private long getConsultationTime() {
        return System.currentTimeMillis() - consultationTime;
    }

    @Override
    public String giveResponseToUser(String query) {
        return "Сonsultant response to thr user";
    }
}
