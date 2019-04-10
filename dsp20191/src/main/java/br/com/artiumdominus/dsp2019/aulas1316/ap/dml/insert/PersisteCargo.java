package br.com.artiumdominus.dsp2019.aulas1316.ap.dml.insert;

import br.com.artiumdominus.dsp2019.aulas1316.ap.base.PersistenciaJdbc;
import br.com.artiumdominus.dsp2019.aulas1316.ap.model.Cargo;

public class PersisteCargo extends PersistenciaJdbc {

    public boolean persisteCargo(Cargo cargo) throws Exception {

        preparaPersistencia();

        String sql = "INSERT INTO CARGOS " +
                "VALUES('" + cargo.getId() +
                "','" + cargo.getNome() +
                "','" + cargo.getSalario() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Cargo foi persistido corretamente.");
        stmt.close();
        connection.close();

        return true;
    }

}
