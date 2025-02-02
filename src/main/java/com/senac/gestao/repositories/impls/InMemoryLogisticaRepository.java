package com.senac.gestao.repositories.impls;

import com.senac.gestao.models.Logistica;
import com.senac.gestao.repositories.LogisticaRepository;

import java.util.*;

public class InMemoryLogisticaRepository implements LogisticaRepository {
    private final Map<Integer, Logistica> logisticaMap = new HashMap<>();
    private int nextId = 1;

    @Override
    public Logistica save(Logistica logistica) {
        if (logistica.getId() == 0) {
            logistica.setId(nextId++);
        }
        logisticaMap.put(logistica.getId(), logistica);
        return logistica;
    }

    @Override
    public Optional<Logistica> findById(int id) {
        return Optional.ofNullable(logisticaMap.get(id));
    }

    @Override
    public List<Logistica> findAll() {
        return new ArrayList<>(logisticaMap.values());
    }

    @Override
    public Logistica update(Logistica logistica) {
        if (logisticaMap.containsKey(logistica.getId())) {
            logisticaMap.put(logistica.getId(), logistica);
            return logistica;
        }
        throw new RuntimeException("Logística não encontrada");
    }

    @Override
    public void delete(int id) {
        logisticaMap.remove(id);
    }
}
