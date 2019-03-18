package com.javaguru.lessons.lesson8.validator;

class MaxLengthValidationRule extends AbstractValidationRule {

    @Override
    public boolean validate(String value) {
        if (!checkNotNull(value)) {
            return false;
        }
        if (value.length() > 32) {
            return false;
        }
        return true;
    }
}
