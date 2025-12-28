package com.humeyra.calorietracker.service.impl;

import com.humeyra.calorietracker.entity.User;
import com.humeyra.calorietracker.repository.UserRepository;
import com.humeyra.calorietracker.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.lang.NonNull;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public @NonNull User save(@NonNull User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public @NonNull User getById(@NonNull Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
