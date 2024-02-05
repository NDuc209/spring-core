package com.ndz.app.repository;

import com.ndz.app.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
    author: NMDuc
    created_at: 2/1/2024
    github: https://github.com/NDZwei
*/
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role getRoleByName(String name);
}
