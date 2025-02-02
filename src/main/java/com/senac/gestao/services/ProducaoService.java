package com.senac.gestao.services;

import com.senac.gestao.models.Producao;

import java.util.List;
import java.util.Optional;

public interface ProducaoService {
    Producao cadastrarProducao(Producao producao);

    Producao atualizarProducao(Producao producao);

    Optional<Producao> consultarProducao(int id);

    List<Producao> listarProducao();

    void excluirProducao(int id);
}