package com.senac.gestao.services.impls;

import com.senac.gestao.models.Pessoa;
import com.senac.gestao.repositories.PessoaRepository;
import com.senac.gestao.services.PessoaService;

import java.util.List;
import java.util.Optional;

public class PessoaServiceImpl implements PessoaService {
    private final PessoaRepository pessoaRepository;

    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public Pessoa cadastrarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public Pessoa atualizarDados(Pessoa pessoa) {
        return pessoaRepository.update(pessoa);
    }

    @Override
    public Optional<Pessoa> consultarPessoa(int id) {
        return pessoaRepository.findById(id);
    }

    @Override
    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll();
    }

    @Override
    public void excluirPessoa(int id) {
        pessoaRepository.delete(id);
    }
}
