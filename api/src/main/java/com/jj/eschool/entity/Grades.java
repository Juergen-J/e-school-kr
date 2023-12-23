package com.jj.eschool.entity;

import com.jj.eschool.entity.enums.Grade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "grades")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Grades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gradeID;
    @OneToOne
    private User studentID;
    @OneToOne
    private Course courseID;
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Grade grade;
    private LocalDate date;

}
