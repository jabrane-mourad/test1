package com.ensakh.sonarqualitygate.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String processUser(String id) {
        if ("admin".equals(id)) {
            return "Administrator";
        } else if ("guest".equals(id)) {
            return "Guest";
        } else {
            return "Unknown";
        }
    }

    public void unusedMethod() {
        // Unused method
    }
}
