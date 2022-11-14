package com.aspect.myannotation.validatoranntation;

import java.lang.annotation.*;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = MyValidatorClass.class)
public @interface MyValidatorAnnotation {

    String message() default "This is Default Message";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
