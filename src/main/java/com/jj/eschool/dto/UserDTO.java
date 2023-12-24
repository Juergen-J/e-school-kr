package com.jj.eschool.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jj.eschool.entity.enums.UserRole;

public record UserDTO(
        String username,
        @JsonIgnore
        String password,
        String email,
        UserRole role,
        PersonalDataDTO personalInfo
) {
}
