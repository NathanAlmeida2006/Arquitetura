package com.senac.gestao.controllers;

import com.senac.gestao.models.RH;
import com.senac.gestao.services.RHService;

import java.util.List;

public class RHController {
    private final RHService rhService;

    public RHController(RHService rhService) {
        this.rhService = rhService;
    }

    public RH cadastrarRH(RH rh) {
        return rhService.cadastrarRH(rh);
    }

    public RH atualizarRH(RH rh) {
        return rhService.atualizarRH(rh);
    }

    public RH consultarRH(int id) {
        return rhService.consultarRH(id).orElse(null);
    }

    public List<RH> listarRH() {
        return rhService.listarRH();
    }

    public void excluirRH(int id) {
        rhService.excluirRH(id);
    }

    public void calcularFolhaPagamento() {
        rhService.calcularFolhaPagamento();
    }

    public void gerenciarFerias() {
        rhService.gerenciarFerias();
    }

    public void avaliarDesempenho() {
        rhService.avaliarDesempenho();
    }

    public void processarAdmissao() {
        rhService.processarAdmissao();
    }
}
