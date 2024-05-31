package org.example.Helper;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.ValidatorFactory;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

import java.util.Set;

public class Validator {
    private static final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    private static final jakarta.validation.Validator validator = factory.getValidator();

    public static <T> Set<ConstraintViolation<T>> validate (T entity){
        return validator.validate(entity);
    }
}
