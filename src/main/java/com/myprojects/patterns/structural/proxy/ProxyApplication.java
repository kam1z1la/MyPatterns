package com.myprojects.patterns.structural.proxy;

import java.util.Scanner;

public class ProxyApplication {
    public static void main(String[] args) {
        СonsultationProxy proxy = new СonsultationProxy();
        System.out.println("The user starts asking questions");

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println(proxy.giveResponseToUser(in.nextLine()));
        }
    }
}
