package com.example.workforces.domain;


import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "Departements")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
}
