package br.com.artiumdominus.dsp2019.aulas1316.ap.dml.insert;

import br.com.artiumdominus.dsp2019.aulas1316.ap.base.PersistenciaJdbc;
import br.com.artiumdominus.dsp2019.aulas1316.ap.model.Departamento;

public class PersisteDepartamento extends PersistenciaJdbc {

    public boolean persisteDepartamento(Departamento departamento) throws Exception {

        preparaPersistencia();

        String sql = "INSERT INTO DEPARTAMENTOS " +
                "VALUES('" + departamento.getId() +
                "','" + departamento.getNome() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Departamento foi persistido corretamente.");
        stmt.close();
        connection.close();

        return true;
    }

}
