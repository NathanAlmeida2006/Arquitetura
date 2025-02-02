package com.senac.gestao.repositories;

import com.senac.gestao.models.Pessoa;

import java.util.List;
import java.util.Optional;

public interface PessoaRepository {
    Pessoa save(Pessoa pessoa);

    Optional<Pessoa> findById(int id);

    List<Pessoa> findAll();

    Pessoa update(Pessoa pessoa);

    void delete(int id);
}
