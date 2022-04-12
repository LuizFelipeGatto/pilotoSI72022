package br.edu.pds.piloto.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="cidades")
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

}
