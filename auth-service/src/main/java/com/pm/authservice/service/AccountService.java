package com.pm.authservice.service;

import com.pm.authservice.model.AuthUser;
import com.pm.authservice.repository.AuthRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    private final AuthRepository authRepository;

    public AccountService(AuthRepository authRepository) {
        this.authRepository = authRepository;

    }

    public Optional<AuthUser> findByEmail(String email){
        return authRepository.findByEmail(email);

    }
}
