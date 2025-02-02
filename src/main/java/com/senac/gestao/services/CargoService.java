package com.senac.gestao.services;

import com.senac.gestao.models.Cargo;

import java.util.List;
import java.util.Optional;

public interface CargoService {
    Cargo criarCargo(Cargo cargo);

    Cargo atualizarCargo(Cargo cargo);

    Optional<Cargo> consultarCargo(int idCargo);

    List<Cargo> listarCargos();

    void deletarCargo(int idCargo);
}
