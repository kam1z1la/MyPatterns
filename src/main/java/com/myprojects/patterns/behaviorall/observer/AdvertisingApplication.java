package com.myprojects.patterns.behaviorall.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdvertisingApplication {
    public static void main(String[] args) {
        Сustomer igor = Сustomer.builder()
                .name("Igor")
                .phoneNumber("123456789")
                .email("test@gmail.com")
                .build();

        Сustomer egor = Сustomer.builder()
                .name("Egor")
                .phoneNumber("123456789")
                .email("test@gmail.com")
                .build();

        AdvertisingMailing mailing = new AdvertisingMailing();
        mailing.subscribe(igor);
        mailing.subscribe(egor);
        mailing.notifyCustomers();
        mailing.unsubscribe(igor);
        mailing.unsubscribe(egor);
    }
}
