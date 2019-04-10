package br.com.artiumdominus.dsp2019.aulas1316.ap;

import br.com.artiumdominus.dsp2019.aulas1316.ap.ddl.criacao.*;
import br.com.artiumdominus.dsp2019.aulas1316.ap.dml.insert.PersisteFuncionario;
import br.com.artiumdominus.dsp2019.aulas1316.ap.model.Funcionario;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Criação das tabelas
        try {
            TabelaFuncionariosCreate tabela = new TabelaFuncionariosCreate();
            tabela.criaTabela();
            TabelaDepartamentosCreate tabela2 = new TabelaDepartamentosCreate();
            tabela2.criaTabela();
            TabelaCargosCreate tabela3 = new TabelaCargosCreate();
            tabela3.criaTabela();
            TabelaLotacoesCreate tabela4 = new TabelaLotacoesCreate();
            tabela4.criaTabela();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Persistencia dos funcionários
        List<Funcionario> funcionarios = new LinkedList<Funcionario>();

        funcionarios.add(new Funcionario(1L, "Pedro Basilio", 201602511L));
        funcionarios.add(new Funcionario(2L, "Gustavo Batista", 201602493L));
        funcionarios.add(new Funcionario(3L, "Murillo Gordo", 201602506L));
        funcionarios.add(new Funcionario(4L, "Fernando Henrique", 201602487L));
        funcionarios.add(new Funcionario(5L, "Marcos Rafael", 201607112L));
        funcionarios.add(new Funcionario(6L, "Saulo Calixto", 201609824L));
        funcionarios.add(new Funcionario(7L, "Lucas Nunes", 201202273L));
        funcionarios.add(new Funcionario(8L, "João Paulo", 201602497L));
        funcionarios.add(new Funcionario(9L, "Rafael Gonçalves", 201609824L));
        funcionarios.add(new Funcionario(10L, "Rafael Quirino", 201501605L));

        PersisteFuncionario pf = new PersisteFuncionario();

        for (Funcionario funcionario : funcionarios) {
            try {
                pf.persisteFuncionario(funcionario);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
