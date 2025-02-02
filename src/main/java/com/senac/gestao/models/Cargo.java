package com.senac.gestao.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cargo {
    private int idCargo;
    private String nomeCargo;
    private String descricao;
    private double salarioBase;
    private String nivel;
    private String departamento;
    private List<String> requisitos;
}
