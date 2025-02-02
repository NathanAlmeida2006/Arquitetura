package com.senac.gestao.services.impls;

import com.senac.gestao.models.Logistica;
import com.senac.gestao.repositories.LogisticaRepository;
import com.senac.gestao.services.LogisticaService;

import java.util.List;
import java.util.Optional;

public class LogisticaServiceImpl implements LogisticaService {
    private final LogisticaRepository logisticaRepository;

    public LogisticaServiceImpl(LogisticaRepository logisticaRepository) {
        this.logisticaRepository = logisticaRepository;
    }

    @Override
    public Logistica cadastrarLogistica(Logistica logistica) {
        return logisticaRepository.save(logistica);
    }

    @Override
    public Logistica atualizarLogistica(Logistica logistica) {
        return logisticaRepository.update(logistica);
    }

    @Override
    public Optional<Logistica> consultarLogistica(int id) {
        return logisticaRepository.findById(id);
    }

    @Override
    public List<Logistica> listarLogistica() {
        return logisticaRepository.findAll();
    }

    @Override
    public void excluirLogistica(int id) {
        logisticaRepository.delete(id);
    }

    @Override
    public void gerenciarEstoque() {
        System.out.println("Gerenciando Logistica");
    }

    @Override
    public void calcularFrete() {
        System.out.println("Calculando Frete");

    }

    @Override
    public void rastrearPedido() {
        System.out.println("Rastreando Pedido");
    }

    @Override
    public void emitirNotaFiscal() {
        System.out.println("Emitir Nota Fiscal");

    }
}
