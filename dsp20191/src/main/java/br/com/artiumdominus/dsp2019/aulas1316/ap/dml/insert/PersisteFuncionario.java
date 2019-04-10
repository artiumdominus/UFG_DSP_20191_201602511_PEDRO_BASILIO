package br.com.artiumdominus.dsp2019.aulas1316.ap.dml.insert;

import br.com.artiumdominus.dsp2019.aulas1316.ap.base.PersistenciaJdbc;
import br.com.artiumdominus.dsp2019.aulas1316.ap.model.Funcionario;

public class PersisteFuncionario extends PersistenciaJdbc {

    public boolean persisteFuncionario(Funcionario funcionario) throws Exception {

        preparaPersistencia();

        String sql = "INSERT INTO FUNCIONARIOS " +
                "VALUES('" + funcionario.getId() +
                "','" + funcionario.getNome() +
                "','" + funcionario.getMatricula() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Funcionário foi persistido corretamente.");
        stmt.close();
        connection.close();

        return true;
    }

}
