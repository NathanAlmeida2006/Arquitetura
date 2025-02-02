package com.senac.gestao.app;

import com.senac.gestao.controllers.*;
import com.senac.gestao.models.*;
import com.senac.gestao.repositories.*;
import com.senac.gestao.repositories.impls.*;
import com.senac.gestao.services.*;
import com.senac.gestao.services.impls.*;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Repositórios
        LogisticaRepository logisticaRepository = new InMemoryLogisticaRepository();
        PessoaRepository pessoaRepository = new InMemoryPessoaRepository();
        ProducaoRepository producaoRepository = new InMemoryProducaoRepository();
        RHRepository rhRepository = new InMemoryRHRepository();
        CargoRepository cargoRepository = new InMemoryCargoRepository();

        // Serviços
        LogisticaService logisticaService = new LogisticaServiceImpl(logisticaRepository);
        PessoaService pessoaService = new PessoaServiceImpl(pessoaRepository);
        ProducaoService producaoService = new ProducaoServiceImpl(producaoRepository);
        RHService rhService = new RHServiceImpl(rhRepository);
        CargoService cargoService = new CargoServiceImpl(cargoRepository);

        // Controllers
        LogisticaController logisticaController = new LogisticaController(logisticaService);
        PessoaController pessoaController = new PessoaController(pessoaService);
        ProducaoController producaoController = new ProducaoController(producaoService);
        RHController rhController = new RHController(rhService);
        CargoController cargoController = new CargoController(cargoService);

        // Exemplos de uso

        // 1. Cadastrar um Cargo
        Cargo cargo = new Cargo();
        cargo.setNomeCargo("Analista de Logística");
        cargo.setDescricao("Responsável por gerenciar operações logísticas");
        cargo.setSalarioBase(5000.0);
        cargo.setNivel("Júnior");
        cargo.setDepartamento("Logística");
        cargo.setRequisitos(List.of("Conhecimento em SAP", "Inglês intermediário"));
        cargoController.criarCargo(cargo);
        System.out.println("Cargo cadastrado: " + cargo);


        // 2. Cadastrar uma Pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João Silva");
        pessoa.setIdade(30);
        pessoa.setSexo('M');
        pessoa.setEndereco(List.of("Rua A, 123", "São Paulo, SP"));
        pessoa.setEmail("joao.silva@example.com");
        pessoa.setTelefone(List.of("11987654321", "1123456789"));
        pessoa.setCargo(cargo);
        pessoaController.cadastrarPessoa(pessoa);
        System.out.println("Pessoa cadastrada: " + pessoa);

        // 3. Cadastrar um RH associado à Pessoa
        RH rh = new RH();
        rh.setSalario(6000.0);
        rh.setCargo("Analista de RH");
        rh.setDataAdmissao(new Date());
        rh.setDepartamento("Recursos Humanos");
        rh.setNumeroMatricula(12345);
        rh.setBeneficios(List.of("Vale-refeição", "Plano de saúde"));
        rh.setRegimeTrabalho("CLT");
        rh.setPessoaId(pessoa.getId()); // Associa ao ID da Pessoa cadastrada
        rhController.cadastrarRH(rh);
        System.out.println("RH cadastrado: " + rh);

        // 4. Cadastrar uma Produção
        Producao producao = new Producao();
        producao.setLoteProducao(101);
        producao.setCustoProducao(15000.0);
        producao.setQuantidadeProduzida(1000);
        producao.setMateriaPrima(List.of("Aço", "Plástico"));
        producao.setLinhaProducao("Linha 1");
        producao.setTempoProducao(8.5);
        producao.setStatusProducao("Em andamento");
        producao.setPessoaId(pessoa.getId()); // Associa ao ID da Pessoa cadastrada
        producaoController.cadastrarProducao(producao);
        System.out.println("Produção cadastrada: " + producao);

        // 5. Cadastrar uma Logística
        Logistica logistica = new Logistica();
        logistica.setIdPedido(1001);
        logistica.setProdutos(List.of("Produto A", "Produto B"));
        logistica.setCustoFrete(250.0);
        logistica.setStatusEntrega("Em trânsito");
        logistica.setPrevisaoEntrega(new Date());
        logistica.setQuantidadeEstoque(500);
        logistica.setFornecedor("Fornecedor X");
        logistica.setPessoaId(pessoa.getId()); // Associa ao ID da Pessoa cadastrada
        logisticaController.cadastrarLogistica(logistica);
        System.out.println("Logística cadastrada: " + logistica);

        // 6. Consultar todas as entidades
        System.out.println("\nConsultando todas as entidades:");

        System.out.println("\nPessoa:");
        System.out.println(pessoaController.consultarPessoa(pessoa.getId()));

        System.out.println("\nCargo:");
        System.out.println(cargoController.consultarCargo(cargo.getIdCargo()));

        System.out.println("\nRH:");
        System.out.println(rhController.consultarRH(rh.getId()));

        System.out.println("\nProdução:");
        System.out.println(producaoController.consultarProducao(producao.getId()));

        System.out.println("\nLogística:");
        System.out.println(logisticaController.consultarLogistica(logistica.getId()));

        // 7. Atualizar uma entidade (exemplo: atualizar o salário do RH)
        rh.setSalario(6500.0);
        rhController.atualizarRH(rh);
        System.out.println("\nRH atualizado: " + rhController.consultarRH(rh.getId()));

        // 8. Excluir uma entidade (exemplo: excluir a Produção)
        producaoController.excluirProducao(producao.getId());
        System.out.println("\nProdução excluída. Consultando novamente: " + producaoController.consultarProducao(producao.getId()));
    }
}
