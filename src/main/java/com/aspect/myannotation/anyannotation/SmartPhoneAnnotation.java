package com.aspect.myannotation.anyannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SmartPhoneAnnotation {

    String name() default "Default Name";
    int version() default 1;
}
