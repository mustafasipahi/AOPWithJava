package com.aspect.myannotation.anyannotation;

public class Test {

    public static void main(String[] args) {

        NokiaPhone nokiaPhone = new NokiaPhone("3310", "2010", 1212, 1000);

        Class<? extends NokiaPhone> aClass = nokiaPhone.getClass();
        SmartPhoneAnnotation annotation = aClass.getAnnotation(SmartPhoneAnnotation.class);

        System.out.println(annotation.name());
        System.out.println(annotation.version());
    }
}
