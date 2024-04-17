package com.noivas_eliane.course.config;

import com.noivas_eliane.course.entities.User;
import com.noivas_eliane.course.repositorie.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository usuarioRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null ,"Maria", "maria@gmail.com", "99999999", "and36587cd");
        User u2 = new User(null ,"Jose", "jose@gmail.com", "66666669999", "and36587cd");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
