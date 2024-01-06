package com.example.ejemindat2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Muchas mascotas")
public class MascotaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nombre", nullable = true)
    private String name;
    private String Raza;

    private Integer Peso;

    @ManyToOne
    @JoinTable(name = "id_usuarios")

    private UserEntity user;

}
