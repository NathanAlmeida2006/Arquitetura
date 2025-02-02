package com.senac.gestao.repositories;

import com.senac.gestao.models.Cargo;

import java.util.List;
import java.util.Optional;

public interface CargoRepository {
    Cargo save(Cargo cargo);

    Optional<Cargo> findById(int idCargo);

    List<Cargo> findAll();

    Cargo update(Cargo cargo);

    void delete(int idCargo);
}