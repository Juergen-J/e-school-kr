package com.jj.eschool.mapper;

import com.jj.eschool.dto.UserDTO;
import com.jj.eschool.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {
    @Mapping(target = "userID", ignore = true)
    User toEntity(UserDTO userDTO);

    @Mapping(target = "password", ignore = true)
    UserDTO toDTO(User user);
}
