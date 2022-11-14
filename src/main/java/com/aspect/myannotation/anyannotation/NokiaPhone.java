package com.aspect.myannotation.anyannotation;

@SmartPhoneAnnotation(name = "Nokia", version = 3)
public class NokiaPhone {

    String model;
    String age;
    int size;
    int amount;

    public NokiaPhone(String model, String age, int size, int amount) {
        this.model = model;
        this.age = age;
        this.size = size;
        this.amount = amount;
    }
}
