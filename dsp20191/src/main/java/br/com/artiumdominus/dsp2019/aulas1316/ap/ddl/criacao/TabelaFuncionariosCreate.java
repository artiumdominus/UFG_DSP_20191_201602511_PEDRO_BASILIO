package br.com.artiumdominus.dsp2019.aulas1316.ap.ddl.criacao;

import br.com.artiumdominus.dsp2019.aulas1316.ap.base.PersistenciaJdbc;

public class TabelaFuncionariosCreate extends PersistenciaJdbc {

    public boolean criaTabela() throws Exception {

        preparaPersistencia();

        System.out.println("Criando a tabela Funcionarios");

        String sql = "CREATE TABLE IF NOT EXISTS FUNCIONARIOS(\n" +
                "ID_FUNCIONARIO LONG NOT NULL PRIMARY KEY,\n" +
                "NOME VARCHAR(100) NOT NULL," +
                "MATRICULA LONG NOT NULL\n" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Funcionarios criada com sucesso!");

        stmt.close();
        connection.close();
        return true;
    }

}
