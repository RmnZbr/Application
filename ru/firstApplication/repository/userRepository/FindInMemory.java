package ru.firstApplication.repository.userRepository;

import java.util.ArrayList;

public class FindInMemory implements UserRepository {

    private ArrayList<Object> repository;

    public String find(String name) {
        return null;
    }

    public int findById(int id) {
        return 0;
    }

    public void findAll() {}
}
