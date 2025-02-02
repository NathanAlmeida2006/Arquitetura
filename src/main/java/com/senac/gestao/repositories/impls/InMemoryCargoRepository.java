package com.senac.gestao.repositories.impls;

import com.senac.gestao.models.Cargo;
import com.senac.gestao.repositories.CargoRepository;

import java.util.*;

public class InMemoryCargoRepository implements CargoRepository {
    private final Map<Integer, Cargo> cargoMap = new HashMap<>();
    private int nextId = 1;

    @Override
    public Cargo save(Cargo cargo) {
        if (cargo.getIdCargo() == 0) {
            cargo.setIdCargo(nextId++);
        }
        cargoMap.put(cargo.getIdCargo(), cargo);
        return cargo;
    }

    @Override
    public Optional<Cargo> findById(int idCargo) {
        return Optional.ofNullable(cargoMap.get(idCargo));
    }

    @Override
    public List<Cargo> findAll() {
        return new ArrayList<>(cargoMap.values());
    }

    @Override
    public Cargo update(Cargo cargo) {
        if (cargoMap.containsKey(cargo.getIdCargo())) {
            cargoMap.put(cargo.getIdCargo(), cargo);
            return cargo;
        }
        throw new RuntimeException("Cargo não encontrado");
    }

    @Override
    public void delete(int idCargo) {
        cargoMap.remove(idCargo);
    }
}
