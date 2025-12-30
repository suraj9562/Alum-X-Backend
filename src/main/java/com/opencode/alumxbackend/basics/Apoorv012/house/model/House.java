package com.opencode.alumxbackend.basics.Apoorv012.house.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String number;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 1000)
    private String address;

    @Column(nullable = false)
    private Integer pincode;

    @Column(nullable = false)
    private Integer bhk;
    
}
