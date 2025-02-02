package com.senac.gestao.controllers;

import com.senac.gestao.models.Logistica;
import com.senac.gestao.services.LogisticaService;

import java.util.List;

public class LogisticaController {
    private final LogisticaService logisticaService;

    public LogisticaController(LogisticaService logisticaService) {
        this.logisticaService = logisticaService;
    }

    public void cadastrarLogistica(Logistica logistica) {
        logisticaService.cadastrarLogistica(logistica);
    }

    public Logistica atualizarLogistica(Logistica logistica) {
        return logisticaService.atualizarLogistica(logistica);
    }

    public Logistica consultarLogistica(int id) {
        return logisticaService.consultarLogistica(id).orElse(null);
    }

    public List<Logistica> listarLogistica() {
        return logisticaService.listarLogistica();
    }

    public void excluirLogistica(int id) {
        logisticaService.excluirLogistica(id);
    }

    public void gerenciarEstoque() {
        logisticaService.gerenciarEstoque();
    }

    public void calcularFrete() {
        logisticaService.calcularFrete();
    }

    public void rastrearPedido() {
        logisticaService.rastrearPedido();
    }

    public void emitirNotaFiscal() {
        logisticaService.emitirNotaFiscal();
    }
}