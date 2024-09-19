package com.ensakh.sonarqualitygate.util;

public class ConfigUtil {

    public String getDatabasePassword() {
        return "123456"; // Hardcoded password
    }

    public int getMaxRetryAttempts() {
        return 3; // Magic number
    }
}
