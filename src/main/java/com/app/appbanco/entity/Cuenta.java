package com.app.appbanco.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Cuenta", nullable = false, unique = true)
    private Long idCuenta;

    @ManyToOne
    private Cliente Cliente;


}
