package com.raazdk.Docushare.repository;

import com.raazdk.Docushare.models.AppRole;
import com.raazdk.Docushare.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role>findByRoleName(AppRole rolename);


}
