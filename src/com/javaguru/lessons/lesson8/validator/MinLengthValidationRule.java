package com.javaguru.lessons.lesson8.validator;

class MinLengthValidationRule extends AbstractValidationRule {

    @Override
    public boolean validate(String value) {
        if (!checkNotNull(value)) {
            return false;
        }
        if (value.length() < 3) {
            return false;
        }
        return true;
    }
}
