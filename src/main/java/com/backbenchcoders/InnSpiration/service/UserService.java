package com.backbenchcoders.InnSpiration.service;

import com.backbenchcoders.InnSpiration.dto.ProfileUpdateRequestDto;
import com.backbenchcoders.InnSpiration.dto.UserDto;
import com.backbenchcoders.InnSpiration.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
