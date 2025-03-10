package com.example.authbackend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "worker")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String dob;
    private String gender;
    private String phone;
    private String familyPhone;
    private String address;
    private String currentAddress;
    private String aadhaar;
    private String verification;
    private String category;
    private int experience;
    private String emergencyContact;
    private String emergencyPhone;
}




