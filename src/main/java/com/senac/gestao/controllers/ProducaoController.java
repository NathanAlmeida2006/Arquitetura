package com.senac.gestao.controllers;

import com.senac.gestao.models.Producao;
import com.senac.gestao.services.ProducaoService;

public class ProducaoController {
    private final ProducaoService producaoService;

    public ProducaoController(ProducaoService producaoService) {
        this.producaoService = producaoService;
    }

    public Producao cadastrarProducao(Producao producao) {
        return producaoService.cadastrarProducao(producao);
    }

    public Producao atualizarProducao(Producao producao) {
        return producaoService.atualizarProducao(producao);
    }

    public Producao consultarProducao(int id) {
        return producaoService.consultarProducao(id).orElse(null);
    }

    public void excluirProducao(int id) {
        producaoService.excluirProducao(id);
    }
}
