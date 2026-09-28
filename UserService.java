package com.tickethub.service;
import com.tickethub.model.User;
import com.tickethub.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repo;
    private final PasswordEncoder encoder;
    public UserService(UserRepository repo, PasswordEncoder encoder){this.repo=repo;this.encoder=encoder;}
    public User register(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }
}