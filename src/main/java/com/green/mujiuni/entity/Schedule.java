package com.green.mujiuni.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Schedule extends CreatedAt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleId;

    @ManyToOne
    @JoinColumn(name = "semester_id", nullable = false)
    private Semester semester;

    @Column(nullable = false, length = 50)
    private String scheduleType;

    @Column(nullable = false)
    private LocalDateTime sdt;

    @Column(nullable = false)
    private LocalDateTime edt;

    @Column(nullable = false, length = 255)
    private String description;
}
