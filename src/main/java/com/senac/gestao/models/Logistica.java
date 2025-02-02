package com.senac.gestao.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Logistica {
    private int id;
    private int idPedido;
    private List<String> produtos;
    private double custoFrete;
    private String statusEntrega;
    private Date previsaoEntrega;
    private int quantidadeEstoque;
    private String fornecedor;
    private int pessoaId; // Relacionamento com Pessoa
}
