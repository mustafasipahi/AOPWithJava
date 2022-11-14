package com.aspect.myannotation.validatoranntation;

import javax.validation.constraints.NotBlank;

public class Dto {

    @MyValidatorAnnotation(message = "This is My Message")
    public String value;

    @NotBlank
    public String test;
}
