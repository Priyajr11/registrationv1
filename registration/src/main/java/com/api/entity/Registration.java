package com.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="registrations")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="Name", nullable=false, length = 225)
    private String Name;
    @Column(name="email", nullable=false, unique=true, length = 225)
    private String email;
    @Column(name="mobile", nullable=false, unique=true, length=10)
    private String mobile;
}
