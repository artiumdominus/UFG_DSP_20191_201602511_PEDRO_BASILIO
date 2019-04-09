package br.com.artiumdominus.dsp2019.aulas1316.ap.ddl.criacao;

import br.com.artiumdominus.dsp2019.aulas1316.ap.base.PersistenciaJdbc;

public class TabelaDepartamentosCreate extends PersistenciaJdbc {

    public boolean criaTabela() throws Exception {

        preparaPersistencia();

        System.out.println("Criando a tabela Departamentos");

        String sql = "CREATE TABLE IF NOT EXISTS DEPARTAMENTOS(\n" +
                "ID_DEPARTAMENTO VARCHAR(100) NOT NULL PRIMARY KEY,\n" +
                "NOME VARCHAR(100) NOT NULL," +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Departamentos criada com sucesso!");

        stmt.close();
        connection.close();
        return true;
    }

}
