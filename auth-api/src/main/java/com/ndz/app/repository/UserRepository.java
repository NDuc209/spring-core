package com.ndz.app.repository;

import com.ndz.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    author: NMDuc
    created_at: 2/1/2024
    github: https://github.com/NDZwei
*/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
