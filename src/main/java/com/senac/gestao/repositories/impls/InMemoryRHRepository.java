package com.senac.gestao.repositories.impls;

import com.senac.gestao.models.RH;
import com.senac.gestao.repositories.RHRepository;

import java.util.*;

public class InMemoryRHRepository implements RHRepository {
    private final Map<Integer, RH> rhMap = new HashMap<>();
    private int nextId = 1;

    @Override
    public RH save(RH rh) {
        if (rh.getId() == 0) {
            rh.setId(nextId++);
        }
        rhMap.put(rh.getId(), rh);
        return rh;
    }

    @Override
    public Optional<RH> findById(int id) {
        return Optional.ofNullable(rhMap.get(id));
    }

    @Override
    public List<RH> findAll() {
        return new ArrayList<>(rhMap.values());
    }

    @Override
    public RH update(RH rh) {
        if (rhMap.containsKey(rh.getId())) {
            rhMap.put(rh.getId(), rh);
            return rh;
        }
        throw new RuntimeException("RH não encontrado");
    }

    @Override
    public void delete(int id) {
        rhMap.remove(id);
    }
}
