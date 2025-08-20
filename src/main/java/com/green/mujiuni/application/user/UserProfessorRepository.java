package com.green.mujiuni.application.user;

import com.green.mujiuni.entity.Professor;
import com.green.mujiuni.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfessorRepository extends JpaRepository<Professor, User> {
}
