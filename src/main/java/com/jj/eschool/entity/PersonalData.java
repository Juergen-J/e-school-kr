package com.jj.eschool.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Map;

@Entity
@Table(name = "personal_data")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonalData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personal_info_id")
    private Long personalInfoID;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private String contactInfo;

    private String groupClass;
}
