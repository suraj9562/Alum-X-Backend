package com.opencode.alumxbackend.users.service;

import com.opencode.alumxbackend.users.dto.UserRequest;
import com.opencode.alumxbackend.users.model.User;

public interface UserService {
    User createUser(UserRequest request);
}
