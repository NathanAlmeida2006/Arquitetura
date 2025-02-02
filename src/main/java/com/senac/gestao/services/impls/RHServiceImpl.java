package com.senac.gestao.services.impls;

import com.senac.gestao.models.RH;
import com.senac.gestao.repositories.RHRepository;
import com.senac.gestao.services.RHService;

import java.util.List;
import java.util.Optional;

public class RHServiceImpl implements RHService {
    private final RHRepository rhRepository;

    public RHServiceImpl(RHRepository rhRepository) {
        this.rhRepository = rhRepository;
    }

    @Override
    public RH cadastrarRH(RH rh) {
        return rhRepository.save(rh);
    }

    @Override
    public RH atualizarRH(RH rh) {
        return rhRepository.update(rh);
    }

    @Override
    public Optional<RH> consultarRH(int id) {
        return rhRepository.findById(id);
    }

    @Override
    public List<RH> listarRH() {
        return rhRepository.findAll();
    }

    @Override
    public void excluirRH(int id) {
        rhRepository.delete(id);
    }
}
