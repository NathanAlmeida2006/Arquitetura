package com.senac.gestao.repositories;

import com.senac.gestao.models.Logistica;

import java.util.List;
import java.util.Optional;

public interface LogisticaRepository {
    Logistica save(Logistica logistica);

    Optional<Logistica> findById(int id);

    List<Logistica> findAll();

    Logistica update(Logistica logistica);

    void delete(int id);
}
