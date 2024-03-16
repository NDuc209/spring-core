package com.ndz.app.service;

import com.ndz.app.dto.UserDto;

import java.util.List;

/*
    author: NMDuc
    created_at: 2/1/2024
    github: https://github.com/NDZwei
*/
public interface UserService {
    List<UserDto> getAll();
    UserDto getById(Long id);
    UserDto save(UserDto dto);
    Boolean delete(Long id);
    UserDto getByUsername(String username);
}
