package com.ndz.app.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/*
    author: NMDuc
    created_at: 1/12/2024
    github: https://github.com/NDZwei
*/
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public class BaseEntity extends AuditableEntity {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
}
