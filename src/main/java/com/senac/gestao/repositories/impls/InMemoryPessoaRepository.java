package com.senac.gestao.repositories.impls;

import com.senac.gestao.models.Pessoa;
import com.senac.gestao.repositories.PessoaRepository;

import java.util.*;

public class InMemoryPessoaRepository implements PessoaRepository {
    private final Map<Integer, Pessoa> pessoas = new HashMap<>();
    private int nextId = 1;

    @Override
    public Pessoa save(Pessoa pessoa) {
        if (pessoa.getId() == 0) {
            pessoa.setId(nextId++);
        }
        pessoas.put(pessoa.getId(), pessoa);
        return pessoa;
    }

    @Override
    public Optional<Pessoa> findById(int id) {
        return Optional.ofNullable(pessoas.get(id));
    }

    @Override
    public List<Pessoa> findAll() {
        return new ArrayList<>(pessoas.values());
    }

    @Override
    public Pessoa update(Pessoa pessoa) {
        if (pessoas.containsKey(pessoa.getId())) {
            pessoas.put(pessoa.getId(), pessoa);
            return pessoa;
        }
        throw new RuntimeException("Pessoa não encontrada");
    }

    @Override
    public void delete(int id) {
        pessoas.remove(id);
    }
}
