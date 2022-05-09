package br.edu.pds.piloto.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;
}
