package com.myprojects.patterns.behaviorall.observer;

import java.util.LinkedList;
import java.util.List;

public class AdvertisingMailing {
    private List<Сustomer> customers;

    public AdvertisingMailing() {
        this.customers = new LinkedList<>();
    }

    public void subscribe(Сustomer customer) {
        customers.add(customer);
    }

    public void unsubscribe(Сustomer customer) {
        customers.remove(customer);
    }

    public void notifyCustomers() {
        customers.forEach(customer -> customer.update(
                        String.format("""
                                
                                Dear %s,
                                                        
                                We're thrilled to inform you about our latest promotion on tech products at Comfy! As a token of our appreciation for your continued support, we're delighted to offer you an exclusive discount on a wide range of cutting-edge gadgets and electronics.
                                                        
                                Here are the details of our special offer:
                                                        
                                Discount: Get a whopping 50%% off on all tech items!
                                Validity: This incredible offer is valid from 01.03 to 01.05.
                                Products Eligible: Enjoy savings on everything from smartphones and laptops to accessories and more!
                                Whether you're looking for the latest smartphones, laptops, smart home devices, or accessories, now is the perfect time to upgrade your tech arsenal. Take advantage of this limited-time offer to grab your favorite gadgets at unbeatable prices.
                                                                                                                                                        
                                Best regards, Comfy.
                                """, customer.getName())));
    }
}
