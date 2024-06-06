package com.discord.discria.service;

import com.discord.discria.dto.UserDTO;
import com.discord.discria.entity.User;
import com.discord.discria.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    //GET:  registra um usuario
    public UserDTO registerUser(UserDTO userDTO){
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());
        user.setId(userDTO.getId());
        User savedUser = userRepository.save(user);
        return mapToDTO(savedUser);
    }


    //GET:  cria objeto e popula ele com os dados para serem enviados pro banco de dados
    public UserDTO mapToDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setEmail(user.getEmail());
        return userDTO;
    }

}
