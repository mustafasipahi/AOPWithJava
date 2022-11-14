package com.aspect.myannotation.validatoranntation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class MyValidatorClass implements ConstraintValidator<MyValidatorAnnotation, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        final List<String> validValueList = Arrays.asList("A", "B", "C");

        return validValueList.contains(value);
    }
}
