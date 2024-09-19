package com.ensakh.sonarqualitygate.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String findUserById(String id) {
        String sql = "SELECT name FROM users WHERE id = '" + id + "'"; // SQL injection vulnerability
        return jdbcTemplate.queryForObject(sql, String.class);
    }
}
