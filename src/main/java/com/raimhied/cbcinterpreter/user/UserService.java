package com.raimhied.cbcinterpreter.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(
                new User(20, 'm')
        );
    }

}
