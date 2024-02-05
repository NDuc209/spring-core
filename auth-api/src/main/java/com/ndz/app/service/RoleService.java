package com.ndz.app.service;

import com.ndz.app.dto.RoleDto;

import java.util.List;

/*
    author: NMDuc
    created_at: 2/1/2024
    github: https://github.com/NDZwei
*/
public interface RoleService {
    List<RoleDto> getAll();

    RoleDto findByName(String name);

    RoleDto save(RoleDto dto);
}
