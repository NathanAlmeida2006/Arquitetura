package com.senac.gestao.repositories.impls;

import com.senac.gestao.models.Producao;
import com.senac.gestao.repositories.ProducaoRepository;

import java.util.*;

public class InMemoryProducaoRepository implements ProducaoRepository {
    private final Map<Integer, Producao> producaoMap = new HashMap<>();
    private int nextId = 1;

    @Override
    public Producao save(Producao producao) {
        if (producao.getId() == 0) {
            producao.setId(nextId++);
        }
        producaoMap.put(producao.getId(), producao);
        return producao;
    }

    @Override
    public Optional<Producao> findById(int id) {
        return Optional.ofNullable(producaoMap.get(id));
    }

    @Override
    public List<Producao> findAll() {
        return new ArrayList<>(producaoMap.values());
    }

    @Override
    public Producao update(Producao producao) {
        if (producaoMap.containsKey(producao.getId())) {
            producaoMap.put(producao.getId(), producao);
            return producao;
        }
        throw new RuntimeException("Produção não encontrada");
    }

    @Override
    public void delete(int id) {
        producaoMap.remove(id);
    }
}
