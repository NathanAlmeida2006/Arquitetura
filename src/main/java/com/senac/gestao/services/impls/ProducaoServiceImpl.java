package com.senac.gestao.services.impls;

import com.senac.gestao.models.Producao;
import com.senac.gestao.repositories.ProducaoRepository;
import com.senac.gestao.services.ProducaoService;

import java.util.List;
import java.util.Optional;

public class ProducaoServiceImpl implements ProducaoService {
    private final ProducaoRepository producaoRepository;

    public ProducaoServiceImpl(ProducaoRepository producaoRepository) {
        this.producaoRepository = producaoRepository;
    }

    @Override
    public Producao cadastrarProducao(Producao producao) {
        return producaoRepository.save(producao);
    }

    @Override
    public Producao atualizarProducao(Producao producao) {
        return producaoRepository.update(producao);
    }

    @Override
    public Optional<Producao> consultarProducao(int id) {
        return producaoRepository.findById(id);
    }

    @Override
    public List<Producao> listarProducao() {
        return producaoRepository.findAll();
    }

    @Override
    public void excluirProducao(int id) {
        producaoRepository.delete(id);
    }
}