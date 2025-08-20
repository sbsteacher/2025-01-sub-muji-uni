package com.green.mujiuni.application.user;

import com.green.mujiuni.application.user.model.UserProfessorPostReq;
import com.green.mujiuni.entity.Address;
import com.green.mujiuni.entity.Department;
import com.green.mujiuni.entity.Professor;
import com.green.mujiuni.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserProfessorRepository userProfessorRepository;

    public void postProfessor(UserProfessorPostReq req) {
        User user = User.builder()
                .loginId(req.getLoginId())
                .userRole(req.getUserRole())
                .password(req.getPassword())
                .userName(req.getUserName())
                .birthDate(req.getBirthDate())
                .gender(req.getGender())
                .address(new Address(req.getAddress(), req.getAddDetail()))
                .email(req.getEmail())
                .phone(req.getPhone())
                .build();

        Department department = new Department();
        department.setDeptId(req.getDeptId());

        Professor professor = new Professor();
        professor.setUser(user);
        professor.setDepartment(department);
        professor.setHireDate(req.getHireDate());

        userProfessorRepository.save(professor);
    }
}
