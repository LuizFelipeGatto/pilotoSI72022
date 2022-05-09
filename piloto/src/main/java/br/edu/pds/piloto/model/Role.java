package br.edu.pds.piloto.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nomeRole;
}
