package com.senac.gestao.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producao {
    private int id;
    private int loteProducao;
    private double custoProducao;
    private int quantidadeProduzida;
    private List<String> materiaPrima;
    private String linhaProducao;
    private double tempoProducao;
    private String statusProducao;
    private int pessoaId; // Relacionamento com Pessoa
}
