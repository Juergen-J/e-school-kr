package com.jj.eschool.dto;


import com.jj.eschool.entity.enums.Type;

public record ElectronicLibraryDTO(

        String title,

        Type type,

        String url,

        String description
) {
}
