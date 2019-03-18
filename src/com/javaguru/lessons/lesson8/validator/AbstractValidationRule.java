package com.javaguru.lessons.lesson8.validator;

abstract class AbstractValidationRule implements ValidationRule {

    boolean checkNotNull(String value) {
        if (value == null) {
            return false;
        }
        return true;
    }

}
