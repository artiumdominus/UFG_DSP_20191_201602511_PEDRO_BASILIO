package br.com.artiumdominus.dsp2019.aulas1316.ap;

import br.com.artiumdominus.dsp2019.aulas1316.ap.ddl.criacao.*;
import br.com.artiumdominus.dsp2019.aulas1316.ap.dml.insert.PersisteCargo;
import br.com.artiumdominus.dsp2019.aulas1316.ap.dml.insert.PersisteDepartamento;
import br.com.artiumdominus.dsp2019.aulas1316.ap.dml.insert.PersisteFuncionario;
import br.com.artiumdominus.dsp2019.aulas1316.ap.dml.insert.PersisteLotacao;
import br.com.artiumdominus.dsp2019.aulas1316.ap.model.Funcionario;
import br.com.artiumdominus.dsp2019.aulas1316.ap.model.Cargo;
import br.com.artiumdominus.dsp2019.aulas1316.ap.model.Departamento;
import br.com.artiumdominus.dsp2019.aulas1316.ap.model.Lotacao;

import java.util.List;
import java.util.LinkedList;
import java.sql.Date;

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

        // Persistência dos funcionários
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

        // Persistência dos cargos
        List<Cargo> cargos = new LinkedList<Cargo>();
        cargos.add(new Cargo("1", "Açougueiro", 3000));
        cargos.add(new Cargo("2", "Caçador", 5000));
        cargos.add(new Cargo("3", "Atendente", 1000));

        PersisteCargo pc = new PersisteCargo();

        for (Cargo cargo : cargos) {
            try {
                pc.persisteCargo(cargo);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Persistência dos departamentos
        List<Departamento> departamentos = new LinkedList<Departamento>();
        departamentos.add(new Departamento("1", "Grande Porte"));
        departamentos.add(new Departamento("2", "Pequeno Porte"));
        departamentos.add(new Departamento("3", "Aves"));
        departamentos.add(new Departamento("4", "Peixes"));

        PersisteDepartamento pd = new PersisteDepartamento();

        for (Departamento departamento : departamentos) {
            try {
                pd.persisteDepartamento(departamento);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Persistência das lotações
        List<Lotacao> lotacoes = new LinkedList<Lotacao>();
        lotacoes.add(new Lotacao(1L, new Date(1554865200000L), new Date(1577757600000L), cargos.get(0), departamentos.get(0)));
        lotacoes.add(new Lotacao(2L, new Date(1554865200000L), new Date(1577757600000L), cargos.get(1), departamentos.get(0)));
        lotacoes.add(new Lotacao(3L, new Date(1554865200000L), new Date(1577757600000L), cargos.get(2), departamentos.get(0)));
        lotacoes.add(new Lotacao(4L, new Date(1554865200000L), new Date(1577757600000L), cargos.get(0), departamentos.get(1)));
        lotacoes.add(new Lotacao(5L, new Date(1554865200000L), new Date(1577757600000L), cargos.get(1), departamentos.get(1)));
        lotacoes.add(new Lotacao(6L, new Date(1554865200000L), new Date(1577757600000L), cargos.get(2), departamentos.get(1)));
        lotacoes.add(new Lotacao(7L, new Date(1554865200000L), new Date(1577757600000L), cargos.get(0), departamentos.get(2)));
        lotacoes.add(new Lotacao(8L, new Date(1554865200000L), new Date(1577757600000L), cargos.get(1), departamentos.get(2)));
        lotacoes.add(new Lotacao(9L, new Date(1554865200000L), new Date(1577757600000L), cargos.get(2), departamentos.get(2)));
        lotacoes.add(new Lotacao(10L, new Date(1554865200000L), new Date(1577757600000L), cargos.get(0), departamentos.get(3)));

        PersisteLotacao pl = new PersisteLotacao();

        for (Lotacao lotacao : lotacoes) {
            try {
                pl.persisteLotacao(lotacao);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
