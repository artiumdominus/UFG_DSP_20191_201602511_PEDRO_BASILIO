package br.com.artiumdominus.dsp2019.aulas1316.ap;

import br.com.artiumdominus.dsp2019.aulas1316.ap.ddl.criacao.TabelaFuncionariosCreate;

public class Main {

    public static void main(String[] args) {
        TabelaFuncionariosCreate tabela = new TabelaFuncionariosCreate();
        try {
            tabela.criaTabela();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
