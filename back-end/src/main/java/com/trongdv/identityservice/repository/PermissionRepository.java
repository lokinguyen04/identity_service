package com.trongdv.identityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trongdv.identityservice.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {}
