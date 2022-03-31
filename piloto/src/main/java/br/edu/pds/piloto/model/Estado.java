package br.edu.pds.piloto.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="estados")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String sigla;

}
