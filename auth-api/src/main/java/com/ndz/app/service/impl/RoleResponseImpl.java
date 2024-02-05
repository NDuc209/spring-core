package com.ndz.app.service.impl;

import com.ndz.app.dto.RoleDto;
import com.ndz.app.entity.Role;
import com.ndz.app.repository.RoleRepository;
import com.ndz.app.service.RoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/*
    author: NMDuc
    created_at: 2/1/2024
    github: https://github.com/NDZwei
*/
@Service
@Transactional
public class RoleResponseImpl extends BaseResponse implements RoleService {
    @Resource
    private RoleRepository roleRepository;

    @Override
    public List<RoleDto> getAll() {
        List<Role> roles = roleRepository.findAll();
        return roles.stream()
                .map(RoleDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public RoleDto findByName(String name) {
        Role role = roleRepository.getRoleByName(name);
        return new RoleDto(role);
    }

    @Override
    public RoleDto save(RoleDto dto) {
        if(dto == null) {
            return null;
        }
        Role role = null;
        if(dto.getId() != null) {
            role = roleRepository.findById(dto.getId()).orElse(null);
        }
        if(role == null) {
            role = new Role();
        }
        role.setName(dto.getName());
        role = roleRepository.save(role);
        return new RoleDto(role);
    }
}
