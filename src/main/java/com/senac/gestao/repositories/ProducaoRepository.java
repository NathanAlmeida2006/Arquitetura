package com.senac.gestao.repositories;

import com.senac.gestao.models.Producao;

import java.util.List;
import java.util.Optional;

public interface ProducaoRepository {
    Producao save(Producao producao);

    Optional<Producao> findById(int id);

    List<Producao> findAll();

    Producao update(Producao producao);

    void delete(int id);
}
