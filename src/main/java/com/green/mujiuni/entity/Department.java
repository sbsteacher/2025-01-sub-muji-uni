package com.green.mujiuni.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptId;

    @Column
    private Long headProfId;

    @Column(nullable = false, length = 20)
    private String deptName;

    @Column(nullable = false, length = 20)
    private String status;

    @Column(nullable = false, length = 50)
    private String deptOffice;

    @Column(nullable = false)
    private int deptMaxStd;

    @Column(nullable = false, length = 50)
    private String deptCode;
}
