package com.senac.gestao.controllers;

import com.senac.gestao.models.Cargo;
import com.senac.gestao.services.CargoService;

public class CargoController {
    private final CargoService cargoService;

    public CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    public Cargo criarCargo(Cargo cargo) {
        return cargoService.criarCargo(cargo);
    }

    public Cargo atualizarCargo(Cargo cargo) {
        return cargoService.atualizarCargo(cargo);
    }

    public Cargo consultarCargo(int idCargo) {
        return cargoService.consultarCargo(idCargo).orElse(null);
    }

    public void deletarCargo(int idCargo) {
        cargoService.deletarCargo(idCargo);
    }
}
