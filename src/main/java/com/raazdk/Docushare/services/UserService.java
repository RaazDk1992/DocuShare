package com.raazdk.Docushare.services;

import com.raazdk.Docushare.dto.UserDTO;
import com.raazdk.Docushare.models.DocushareUser;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<DocushareUser> getAllUsers();

    UserDTO getUserById(Long id);
}
