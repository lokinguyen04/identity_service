package com.trongdv.identityservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.trongdv.identityservice.dto.request.RoleRequest;
import com.trongdv.identityservice.dto.response.RoleResponse;
import com.trongdv.identityservice.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
