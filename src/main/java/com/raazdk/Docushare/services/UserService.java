package com.raazdk.Docushare.services;

import com.raazdk.Docushare.models.DocushareUser;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<DocushareUser> getAllUsers();
}
