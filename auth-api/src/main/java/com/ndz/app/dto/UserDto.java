package com.ndz.app.dto;

import com.ndz.app.entity.Role;
import com.ndz.app.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/*
    author: NMDuc
    created_at: 1/2/2024
    github: https://github.com/NDZwei
*/
@Getter
@Setter
@NoArgsConstructor
public class UserDto extends BaseDto {
    private String username;
    private String password;
    private String confirmPassword;
    private Boolean changePassword = false;
    private String email;
    private List<RoleDto> roles = new ArrayList<>();

    public UserDto(User entity) {
        super(entity);
        this.id = entity.getId();
        this.username = entity.getUsername();
        this.email = entity.getEmail();
        if(!CollectionUtils.isEmpty(entity.getRoles())) {
            entity.getRoles().forEach(role -> {
                this.roles.add(new RoleDto(role));
            });
        }
    }


}
