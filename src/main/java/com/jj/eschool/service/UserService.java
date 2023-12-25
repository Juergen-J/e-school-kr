package com.jj.eschool.service;

import com.jj.eschool.dto.UserDTO;
import com.jj.eschool.entity.User;
import com.jj.eschool.entity.enums.UserRole;
import com.jj.eschool.mapper.UserMapper;
import com.jj.eschool.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper = Mappers.getMapper(UserMapper.class);

    private final UserRepository userRepository;

    public List<UserDTO> findAll() {
        return userRepository.findAll().stream()
                .map(userMapper::toDTO)
                .collect(Collectors.toList());
    }

    public List<UserDTO> findAllTeachers() {
        return userRepository.findAll().stream()
                .filter(user -> user.getRole() == UserRole.TEACHER)
                .map(userMapper::toDTO)
                .collect(Collectors.toList());
    }


    public Optional<UserDTO> findById(Long id) {
        return userRepository.findById(id)
                .map(userMapper::toDTO);
    }

    public UserDTO findByUsername(String username) {
        var user = userRepository.findByUsername(username);
        return userMapper.toDTO(user);
    }

    @Transactional
    public UserDTO save(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        user = userRepository.save(user);
        return userMapper.toDTO(user);
    }
}
