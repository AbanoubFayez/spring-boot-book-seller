package com.bebo.springbootbookseller.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users") // don't use 'user' because it is a reserved name in PostgreSQL.
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "creat_name", nullable = false)
    private LocalDateTime createTime;

    //Role -> enumType: String for readability, or ordinal in numbers 0,1,2 for performance
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;
}
