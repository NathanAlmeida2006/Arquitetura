package com.senac.gestao.services;

import com.senac.gestao.models.Pessoa;

import java.util.List;
import java.util.Optional;

public interface PessoaService {
    Pessoa cadastrarPessoa(Pessoa pessoa);

    Pessoa atualizarDados(Pessoa pessoa);

    Optional<Pessoa> consultarPessoa(int id);

    List<Pessoa> listarPessoas();

    void excluirPessoa(int id);
}
