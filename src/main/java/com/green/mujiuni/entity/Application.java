package com.green.mujiuni.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Application extends CreatedAt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appId;

    @ManyToOne
    @JoinColumn(nullable = false, name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(nullable = false, name = "schedule_id")
    private Schedule schedule;

    @Column(nullable = false, length = 20)
    private String status = "미승인";

    @Column(nullable = false, length = 30)
    private String reason;
}
