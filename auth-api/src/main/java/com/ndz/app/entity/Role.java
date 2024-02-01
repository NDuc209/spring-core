package com.ndz.app.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/*
    author: NMDuc
    created_at: 1/12/2024
    github: https://github.com/NDZwei
*/
@Entity
@Table(name = "tbl_role")
@Getter
@Setter
@NoArgsConstructor
public class Role extends BaseEntity {
    @Column(name = "name", length = 20, unique = true, nullable = false)
    private String name;
}
