package br.com.artiumdominus.persistencia;

import br.com.artiumdominus.model.Veiculo;
import org.apache.log4j.Logger;
import org.h2.tools.Server;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.SQLException;

public class PersisteVeiculoTeste {

    Logger logger = Logger.getLogger(PersisteVeiculoTeste.class.getName());

    Server server = null;
    VeiculoRepository repository;

    @BeforeTest
    public void setup() throws SQLException {
        server = Server.createTcpServer().start();
        repository = new VeiculoRepositoryImplementation();
    }

    @Test
    public void TestaPersistenciaPessoa() {
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Volkswagen");
        veiculo.setModelo("Fusca");
        veiculo.setAnoFabricacao(1972);
        veiculo.setAnoModelo(1938);
        veiculo.setPotenciaMotor(50);

        veiculo = repository.create(veiculo);
        System.out.println("Id do veículo: " + veiculo.getId());
        Assert.assertTrue(veiculo != null);
    }
}
