package com.jj.eschool.dto;

import java.time.LocalDate;

public record PersonalDataDTO(

        String firstName,
        String lastName,
        LocalDate dateOfBirth,
        String contactInfo,
        String groupClass
) {
}
