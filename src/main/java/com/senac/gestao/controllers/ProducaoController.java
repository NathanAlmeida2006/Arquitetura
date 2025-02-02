package com.senac.gestao.controllers;

import com.senac.gestao.models.Producao;
import com.senac.gestao.services.ProducaoService;

import java.util.List;

public class ProducaoController {
    private final ProducaoService producaoService;

    public ProducaoController(ProducaoService producaoService) {
        this.producaoService = producaoService;
    }

    public void cadastrarProducao(Producao producao) {
        producaoService.cadastrarProducao(producao);
    }

    public Producao atualizarProducao(Producao producao) {
        return producaoService.atualizarProducao(producao);
    }

    public Producao consultarProducao(int id) {
        return producaoService.consultarProducao(id).orElse(null);
    }

    public List<Producao> listarProducao() {
        return producaoService.listarProducao();
    }

    public void excluirProducao(int id) {
        producaoService.excluirProducao(id);
    }

    public void controlarQualidade() {
        producaoService.controlarQualidade();
    }

    public void planejarProducao() {
        producaoService.planejararProducao();
    }

    public void monitorarProcesso() {
        producaoService.monitorarProcesso();
    }

    public void gerarRelatorioProducao() {
        producaoService.gerarRelatorioProducao();
    }
}
