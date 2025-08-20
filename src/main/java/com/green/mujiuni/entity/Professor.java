package com.green.mujiuni.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@DynamicInsert
@EqualsAndHashCode
public class Professor {

    @EmbeddedId
    private ProfessorIds professorIds;

    @OneToOne
    @JoinColumn(name = "user_id")
    @MapsId("userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    @MapsId("deptId")
    private Department department;

    @Column(nullable = false)
    private LocalDate hireDate;

    @Column(nullable = false, length = 20)
    @ColumnDefault("'재직'")
    private String status;
}
