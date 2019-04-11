package br.com.artiumdominus.dsp20191.aulas1720.ap;

import br.com.artiumdominus.dsp20191.aulas1316.ap.model.*;
import br.com.artiumdominus.dsp20191.aulas1316.ap.base.PersistenciaJdbc;

public class Delete extends PersistenciaJdbc {

    public boolean delete(Funcionario funcionario) throws Exception {

        preparaPersistencia();

        String sql = "DELETE FROM FUNCIONARIOS WHERE ID_FUNCIONARIO = " + funcionario.getId() + ";";

        stmt.executeUpdate(sql);
        System.out.println("O Funcionário foi excluido corretamente.");
        stmt.close();
        connection.close();

        return true;
    }

    public boolean delete(Cargo cargo) throws Exception {

        preparaPersistencia();

        String sql = "DELETE FROM CARGOS WHERE ID_CARGO = " + cargo.getId() + ";";

        stmt.executeUpdate(sql);
        System.out.println("O Cargo foi excluido corretamente.");
        stmt.close();
        connection.close();

        return true;
    }

    public boolean delete(Departamento departamento) throws Exception {

        preparaPersistencia();

        String sql = "DELETE FROM DEPARTAMENTOS WHERE ID_FUNCIONARIO = " + departamento.getId() + ";";

        stmt.executeUpdate(sql);
        System.out.println("O Departamento foi excluido corretamente.");
        stmt.close();
        connection.close();

        return true;
    }

    public boolean delete(Lotacao lotacao) throws Exception {

        preparaPersistencia();

        String sql = "DELETE FROM LOTACOES WHERE ID_FUNCIONARIO = " + lotacao.getId() + ";";

        stmt.executeUpdate(sql);
        System.out.println("A Lotação foi excluida corretamente.");
        stmt.close();
        connection.close();

        return true;
    }
}
