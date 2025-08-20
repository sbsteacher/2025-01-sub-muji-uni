package com.green.mujiuni.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;

@Entity
@Getter
@Setter
@Table(
    uniqueConstraints={
        @UniqueConstraint(
            columnNames = {
                "year",
                "semester"
            }
        ),
    }
)
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long semesterId;

    @Column(nullable = false, columnDefinition = "YEAR")
    private Year year;

    @Column(nullable = false)
    private int semester;
}
