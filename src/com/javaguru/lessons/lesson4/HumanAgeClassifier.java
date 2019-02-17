package com.javaguru.lessons.lesson4;

class HumanAgeClassifier {

    String classify(int age) {
        if (age < 0) {
            return "Wrong age";
        }

        if (age < 4) {
            return "Baby";
        } else if (age <= 12) {
            return "Child";
        } else if (age <= 19) {
            return "Teenager";
        } else if (age <= 50) {
            return "Depressed-broke-working person";
        } else if (age <= 100) {
            return "Senior";
        } else {
            return "Guru";
        }
    }
}
