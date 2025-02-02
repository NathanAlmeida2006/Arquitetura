package com.senac.gestao.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RH {
    private int id;
    private double salario;
    private String cargo;
    private Date dataAdmissao;
    private String departamento;
    private int numeroMatricula;
    private List<String> beneficios;
    private String regimeTrabalho;
    private int pessoaId; // Relacionamento com Pessoa
}
