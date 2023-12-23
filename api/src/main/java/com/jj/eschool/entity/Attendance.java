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
    Long attendanceID;
    User studentID;
    Schedule scheduleID;
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    Status status;

}
