package com.senac.gestao.controllers;

import com.senac.gestao.models.Pessoa;
import com.senac.gestao.services.PessoaService;

public class PessoaController {
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    public Pessoa cadastrarPessoa(Pessoa pessoa) {
        return pessoaService.cadastrarPessoa(pessoa);
    }

    public Pessoa atualizarDados(Pessoa pessoa) {
        return pessoaService.atualizarDados(pessoa);
    }

    public Pessoa consultarPessoa(int id) {
        return pessoaService.consultarPessoa(id).orElse(null);
    }

    public void excluirPessoa(int id) {
        pessoaService.excluirPessoa(id);
    }
}
