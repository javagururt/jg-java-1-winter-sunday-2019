package com.javaguru.lessons.lesson11;

class UserServiceTest {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserRepositoryMock userRepositoryMock = new UserRepositoryMock();

        UserService userService = new UserService(userRepositoryMock);

        userService.createUser();
    }
}
