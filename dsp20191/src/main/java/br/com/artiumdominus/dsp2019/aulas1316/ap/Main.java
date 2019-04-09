package br.com.artiumdominus.dsp2019.aulas1316.ap;

import br.com.artiumdominus.dsp2019.aulas1316.ap.ddl.criacao.*;

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
    }

}
