package com.senac.gestao.services;

import com.senac.gestao.models.RH;

import java.util.List;
import java.util.Optional;

public interface RHService {
    RH cadastrarRH(RH rh);

    RH atualizarRH(RH rh);

    Optional<RH> consultarRH(int id);

    List<RH> listarRH();

    void excluirRH(int id);

    void calcularFolhaPagamento();

    void gerenciarFerias();

    void avaliarDesempenho();

    void processarAdmissao();
}