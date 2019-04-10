package br.com.artiumdominus.dsp2019.aulas1316.ap.dml.insert;

import br.com.artiumdominus.dsp2019.aulas1316.ap.base.PersistenciaJdbc;
import br.com.artiumdominus.dsp2019.aulas1316.ap.model.Lotacao;

import java.util.Calendar;

public class PersisteLotacao extends PersistenciaJdbc {

    public boolean persisteLotacao(Lotacao lotacao) throws Exception {

        preparaPersistencia();

        String sql = "INSERT INTO LOTACOES " +
                "VALUES('" + lotacao.getId() +
                "','" + lotacao.getDataInicial().toString() +
                "','" + lotacao.getDataFinal().toString() +
                "','" + lotacao.getCargo().getId() +
                "','" + lotacao.getDepartamento().getId() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("A Lotação foi persistida corretamente.");
        stmt.close();
        connection.close();

        return true;
    }

}
