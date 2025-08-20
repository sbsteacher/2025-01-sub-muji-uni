package com.green.mujiuni.application.user.model;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class UserProfessorPostReq {
    private String loginId;
    private String userRole;
    private String password;
    private String userName;
    private LocalDate birthDate;
    private Long deptId;
    private LocalDate hireDate;
    private String gender;
    private String address;
    private String addDetail;
    private String email;
    private String phone;
}
