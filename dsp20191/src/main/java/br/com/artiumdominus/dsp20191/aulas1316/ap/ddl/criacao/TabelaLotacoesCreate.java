package br.com.artiumdominus.dsp20191.aulas1316.ap.ddl.criacao;

import br.com.artiumdominus.dsp20191.aulas1316.ap.base.PersistenciaJdbc;

public class TabelaLotacoesCreate extends PersistenciaJdbc {

    public boolean criaTabela() throws Exception {

        preparaPersistencia();

        System.out.println("Criando a tabela Lotações");

        String sql = "CREATE TABLE IF NOT EXISTS LOTACOES(\n" +
                "ID_FUNCIONARIO LONG NOT NULL,\n" +
                "DATA_INICIAL DATE NOT NULL,\n" +
                "DATA_FINAL DATE NOT NULL,\n" +
                "ID_CARGO LONG NOT NULL,\n" +
                "ID_DEPARTAMENTO LONG NOT NULL\n" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Lotações criada com sucesso!");

        stmt.close();
        connection.close();
        return true;
    }

}
