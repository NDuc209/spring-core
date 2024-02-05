package com.ndz.app.dto;

import com.ndz.app.entity.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
    author: NMDuc
    created_at: 1/2/2024
    github: https://github.com/NDZwei
*/
@Getter
@Setter
@NoArgsConstructor
public class RoleDto {
    private Long id;
    private String name;

    public RoleDto(Role entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
}
