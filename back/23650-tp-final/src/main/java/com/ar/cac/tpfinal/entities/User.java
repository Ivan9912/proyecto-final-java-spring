package com.ar.cac.tpfinal.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario")
    private String username;

    @Column(name = "contrasenia")
    private String password;

    private String email;

    private String dni;

    @Column(name = "direccion")
    private String address;

    @Column(name = "fecha_cumpleanios")
    private Date birthday_date;

    // Fecha de creación y modificación (estado) de cada usuarios
    // T-ODO: Refactor
    private LocalDateTime created_at;

    private LocalDateTime updated_at;
    @OneToMany(mappedBy = "propietario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Account> accounts;

    // T-ODO: refactor
    //private List<Account> accounts;
}