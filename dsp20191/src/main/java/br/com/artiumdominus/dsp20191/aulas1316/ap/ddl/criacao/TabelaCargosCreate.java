package br.com.artiumdominus.dsp20191.aulas1316.ap.ddl.criacao;

import br.com.artiumdominus.dsp20191.aulas1316.ap.base.PersistenciaJdbc;

public class TabelaCargosCreate extends PersistenciaJdbc {

    public boolean criaTabela() throws Exception {

        preparaPersistencia();

        System.out.println("Criando a tabela Cargos");

        String sql = "CREATE TABLE IF NOT EXISTS CARGOS(\n" +
                "ID_CARGO LONG NOT NULL PRIMARY KEY,\n" +
                "NOME VARCHAR(100) NOT NULL," +
                "SALARIO DECIMAL(10,2) NOT NULL\n" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Cargos criada com sucesso!");

        stmt.close();
        connection.close();
        return true;
    }

}
