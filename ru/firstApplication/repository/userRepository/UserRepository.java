package ru.firstApplication.repository.userRepository;

public interface UserRepository {
    String find(String name);
    int findById(int id);
    void findAll();
}
