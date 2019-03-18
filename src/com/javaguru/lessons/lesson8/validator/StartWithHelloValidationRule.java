package com.javaguru.lessons.lesson8.validator;

class StartWithHelloValidationRule extends AbstractValidationRule {

    @Override
    public boolean validate(String value) {
        if (!checkNotNull(value)) {
            return false;
        }
        return value.startsWith("Hello");
    }
}
