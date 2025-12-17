package com.mongodbapp.service;

import com.mongodbapp.dto.CreateUserDTO;
import com.mongodbapp.dto.UpdateUserDTO;
import com.mongodbapp.model.User;

public interface UserService extends AbstractService<User,String> {
    User create(CreateUserDTO createUserDTO);
    User update(UpdateUserDTO updateUserDTO);
}
