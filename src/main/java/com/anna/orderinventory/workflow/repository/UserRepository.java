package com.anna.orderinventory.workflow.repository;

import com.anna.orderinventory.workflow.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity,Long> {
    Optional<UsersEntity> findByUsernameAndIsActive(String username, Boolean isActive);


}
