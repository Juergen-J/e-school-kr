package com.jj.eschool.service;

import com.jj.eschool.dto.PersonalDataDTO;
import com.jj.eschool.dto.UserDTO;
import com.jj.eschool.entity.User;
import com.jj.eschool.entity.enums.UserRole;
import com.jj.eschool.mapper.UserMapper;
import com.jj.eschool.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    // Нахождение пользователя по ID и его преобразование в DTO
    public Optional<UserDTO> findById(Long id) {
        return userRepository.findById(id)
                .map(userMapper::toDTO);
    }

    public UserDTO findByUsername(String username) {
        var user = userRepository.findByUsername(username);

        return new UserDTO(
                "UserName",
                null,
                "Email",
                UserRole.ADMIN,
                new PersonalDataDTO("FINAme",
                        "LastName",
                        LocalDate.now(),
                        "Contakt Me Info",
                        "group")
        );
    }

    @Transactional
    public UserDTO save(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        user = userRepository.save(user);
        return userMapper.toDTO(user);
    }

    // Удаление пользователя по ID
    public boolean deleteById(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<UserDTO> update(Long id, UserDTO userDetails) {
        return null;
    }

}
