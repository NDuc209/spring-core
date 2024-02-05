package com.ndz.app.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/*
    author: NMDuc
    created_at: 2/1/2024
    github: https://github.com/NDZwei
*/
public class SecurityUtils {
    public static String getHashPassword(String password) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }

    public static boolean matchesPassword(String oldPassword, String newPassword) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.matches(newPassword, oldPassword);
    }
}
