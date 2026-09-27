package com.anna.orderinventory.workflow.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name="users")

public class UsersEntity {
    @Column(name ="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name = "user_name")
    private String username;
    @Column(name="password")
    private String password;

    @Column(name="is_active")
    private Boolean isActive;
}
