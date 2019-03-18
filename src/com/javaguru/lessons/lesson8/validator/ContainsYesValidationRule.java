package com.javaguru.lessons.lesson8.validator;

class ContainsYesValidationRule extends AbstractValidationRule {
    @Override
    public boolean validate(String value) {
        if (!checkNotNull(value)) {
            return false;
        }
        return value.contains("yes");
    }
}
