package com.jj.eschool.entity;

import com.jj.eschool.entity.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "attendances")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendanceID;

    @OneToOne
    private User student;

    @OneToOne
    private Schedule schedule;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Status status;

}
