package com.green.mujiuni.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class User extends UpdatedAt{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, length = 10, unique = true)
    private String loginId;

    @Column(nullable = false, length = 10)
    private String userRole;

    @Column(nullable = false, length = 25)
    private String password;

    @Column(nullable = false, length = 10)
    private String userName;

    @Column(nullable = false)
    private LocalDate birthDate;

    @Column(nullable = false, length = 1)
    private String gender;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Column(nullable = false, length = 11, unique = true)
    private String phone;

    @Column(length = 50)
    private String userPic;

    @Column(length = 50)
    private String account;

    @Column(nullable = false, length = 255)
    private String addDetail;
}
