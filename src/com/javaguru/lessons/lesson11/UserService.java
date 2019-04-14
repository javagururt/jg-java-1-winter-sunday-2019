package com.javaguru.lessons.lesson11;

class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser() {
        userRepository.save();
    }
}
