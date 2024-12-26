package com.trongdv.identityservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.trongdv.identityservice.dto.request.UserCreationRequest;
import com.trongdv.identityservice.dto.request.UserUpdateRequest;
import com.trongdv.identityservice.dto.response.UserResponse;
import com.trongdv.identityservice.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
