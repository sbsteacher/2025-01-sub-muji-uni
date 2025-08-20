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

    @PostMapping("/professor")
    public String postProfessor(@RequestBody UserProfessorPostReq req) {
        log.info("req: {}", req);
        userService.postProfessor(req);
        return "교수 가입 성공";
    }
}
