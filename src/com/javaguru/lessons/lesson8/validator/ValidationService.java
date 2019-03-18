package com.javaguru.lessons.lesson8.validator;

class ValidationService {

    private ValidationRule[] validationRules;

    ValidationService(ValidationRule[] validationRules) {
        this.validationRules = validationRules;
    }

    boolean validateString(String value) {
        for (ValidationRule validationRule : validationRules) {
            if (!validationRule.validate(value)) {
                return false;
            }
        }
        return true;
    }
}
