package com.senac.gestao.services.impls;

import com.senac.gestao.models.Cargo;
import com.senac.gestao.repositories.CargoRepository;
import com.senac.gestao.services.CargoService;

import java.util.List;
import java.util.Optional;

public class CargoServiceImpl implements CargoService {
    private final CargoRepository cargoRepository;

    public CargoServiceImpl(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    @Override
    public Cargo criarCargo(Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    @Override
    public Cargo atualizarCargo(Cargo cargo) {
        return cargoRepository.update(cargo);
    }

    @Override
    public Optional<Cargo> consultarCargo(int idCargo) {
        return cargoRepository.findById(idCargo);
    }

    @Override
    public List<Cargo> listarCargos() {
        return cargoRepository.findAll();
    }

    @Override
    public void deletarCargo(int idCargo) {
        cargoRepository.delete(idCargo);
    }
}
