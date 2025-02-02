package com.senac.gestao.services;

import com.senac.gestao.models.Logistica;

import java.util.List;
import java.util.Optional;

public interface LogisticaService {
    Logistica cadastrarLogistica(Logistica logistica);

    Logistica atualizarLogistica(Logistica logistica);

    Optional<Logistica> consultarLogistica(int id);

    List<Logistica> listarLogistica();

    void excluirLogistica(int id);

    void gerenciarEstoque();

    void calcularFrete();

    void rastrearPedido();

    void emitirNotaFiscal();
}
