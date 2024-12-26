package com.trongdv.identityservice.mapper;

import org.mapstruct.Mapper;

import com.trongdv.identityservice.dto.request.PermissionRequest;
import com.trongdv.identityservice.dto.response.PermissionResponse;
import com.trongdv.identityservice.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
