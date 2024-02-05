package com.ndz.app.controller;

import com.ndz.app.dto.RoleDto;
import com.ndz.app.service.RoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/*
    author: NMDuc
    created_at: 2/1/2024
    github: https://github.com/NDZwei
*/
@RestController
@RequestMapping(value = "/role")
public class RoleController {
    @Resource
    private RoleService roleService;

    @GetMapping(value = "/all")
    public List<RoleDto> getAll() {
        return roleService.getAll();
    }
}
