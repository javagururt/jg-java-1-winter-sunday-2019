package com.javaguru.lessons.lesson11;

class UserRepositoryMock extends UserRepository {

    private boolean isTriggered;

    @Override
    public void save() {
        isTriggered = true;
        System.out.println("Triggered mock");
    }

    public boolean isTriggered() {
        return isTriggered;
    }
}
