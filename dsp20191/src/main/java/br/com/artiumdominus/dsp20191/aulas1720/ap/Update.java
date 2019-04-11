package br.com.artiumdominus.dsp20191.aulas1720.ap;

import br.com.artiumdominus.dsp20191.aulas1316.ap.model.*;
import br.com.artiumdominus.dsp20191.aulas1316.ap.base.PersistenciaJdbc;

public class Update extends PersistenciaJdbc {

    public boolean update(Funcionario funcionario) throws Exception {

        preparaPersistencia();

        String sql = "UPDATE FUNCIONARIOS\n" +
                "SET NOME = " + funcionario.getNome() + ", " +
                "MATRICULA = " + funcionario.getMatricula() + "\n" +
                "WHERE ID_FUNCIONARIO = " + funcionario.getId() + ";";

        stmt.executeUpdate(sql);
        System.out.println("O Funcionário foi atualizado corretamente.");
        stmt.close();
        connection.close();

        return true;
    }

    public boolean update(Cargo cargo) throws Exception {

        preparaPersistencia();

        String sql = "UPDATE CARGOS\n" +
                "SET NOME = " + cargo.getNome() + ", " +
                "SALARIO = " + cargo.getSalario() + "\n" +
                "WHERE ID_CARGO = " + cargo.getId() + ";";

        stmt.executeUpdate(sql);
        System.out.println("O Cargo foi atualizado corretamente.");
        stmt.close();
        connection.close();

        return true;
    }

    public boolean update(Departamento departamento) throws Exception {

        preparaPersistencia();

        String sql = "UPDATE DEPARTAMENTOS\n" +
                "SET NOME = " + departamento.getNome() + "\n" +
                "WHERE ID_DEPARTAMENTO = " + departamento.getId();

        stmt.executeUpdate(sql);
        System.out.println("O Departamento foi atualizado corretamente.");
        stmt.close();
        connection.close();

        return true;
    }

    public boolean update(Lotacao lotacao) throws Exception {

        preparaPersistencia();

        String sql = "UPDATE LOTACOES\n" +
                "SET DATA_INICIAL = " + lotacao.getDataInicial().toString() + ", " +
                "DATA_FINAL = " + lotacao.getDataFinal().toString() + ", " +
                "ID_CARGO = " + lotacao.getCargo().getId() + ", " +
                "ID_DEPARTAMENTO = " + lotacao.getDepartamento().getId() + "\n" +
                "WHERE ID_FUNCIONARIO = " + lotacao.getId();

        stmt.executeUpdate(sql);
        System.out.println("A Lotação foi atualizada corretamente.");
        stmt.close();
        connection.close();

        return true;
    }

}
