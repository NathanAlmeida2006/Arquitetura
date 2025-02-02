package com.senac.gestao.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private char sexo;
    private List<String> endereco;
    private String email;
    private List<String> telefone;
    private Cargo cargo;
}
