package com.app.appbanco.entity;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity
@Data
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Cliente")
    private Long idCliente;

    //@Column(length = 20)
    private String cedula;

    //@Column(length = 50)
    private String nombre;

    //@Column(length = 50)
    private String correo;

    //@Column(length = 50)
    private String direccion;

    //@Column(length = 30)
    private String numeroCelular;

}
