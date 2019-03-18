package com.javaguru.lessons.lesson8.validator;

class ValidatorTest {

    public static void main(String[] args) {
        ValidationRule minLength = new MinLengthValidationRule();
        ValidationRule maxLength = new MaxLengthValidationRule();
        ValidationRule startsWithHelloValidationRule = new StartWithHelloValidationRule();
        ValidationRule containsYesValidationRule = new ContainsYesValidationRule();

        ValidationRule[] validationRules = {minLength, maxLength,
                startsWithHelloValidationRule, containsYesValidationRule};

        String value = "Hello 1231yes23";

        ValidationService service = new ValidationService(validationRules);

        if (service.validateString(value)) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }

    }
}
