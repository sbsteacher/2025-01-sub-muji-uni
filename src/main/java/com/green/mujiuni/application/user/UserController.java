package com.green.mujiuni.application.user;

import com.green.mujiuni.application.user.model.UserProfessorPostReq;
import com.green.mujiuni.entity.Professor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    /*
    JSON

    {
        "loginId": "miccc",
        "userRole": "professor",
        "password": "mic1212",
        "userName": "홍길당",
        "birthDate": "1980-11-22",
        "deptId": 1,
        "hireDate": "2025-08-20",
        "gender": "M",
        "address": "대구구",
        "addDetail": "달서구구",
        "email": "mic@aaa.com",
        "phone": "01055556666"
    }
     */
    @PostMapping("/professor")
    public String postProfessor(@RequestBody UserProfessorPostReq req) {
        log.info("req: {}", req);
        userService.postProfessor(req);
        return "교수 가입 성공";
    }
}
