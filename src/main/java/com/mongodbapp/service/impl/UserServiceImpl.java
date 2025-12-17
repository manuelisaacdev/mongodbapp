package com.mongodbapp.service.impl;

import com.mongodbapp.dto.CreateUserDTO;
import com.mongodbapp.dto.UpdateUserDTO;
import com.mongodbapp.model.User;
import com.mongodbapp.repository.UserRepository;
import com.mongodbapp.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractServiceImpl<User, String, UserRepository> implements UserService {

    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    public User create(CreateUserDTO createUserDTO) {
        return super.getRepository().save(User.builder()
            .name(createUserDTO.name())
            .gender(createUserDTO.gender())
            .birthOfDate(createUserDTO.birthOfDate())
            .role(createUserDTO.role())
            .email(createUserDTO.email())
            .password(createUserDTO.password())
        .build());
    }

    @Override
    public User update(UpdateUserDTO updateUserDTO) {
        return super.getRepository().save(User.builder()
            .name(updateUserDTO.name())
            .gender(updateUserDTO.gender())
            .birthOfDate(updateUserDTO.birthOfDate())
        .build());
    }
}
