package br.com.artiumdominus.persistencia;

import br.com.artiumdominus.model.Veiculo;
import org.apache.log4j.Logger;
import org.h2.tools.Server;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.SQLException;

public class DeletaVeiculoTeste {

    Logger logger = Logger.getLogger(DeletaVeiculoTeste.class.getName());

    Server server;
    VeiculoRepository repository;

    @BeforeTest
    public void setup() throws SQLException {
        server = Server.createTcpServer().start();
        repository = new VeiculoRepositoryImplementation();
    }

    @Test
    public void deletaVeiculoTeste() {
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Volkswagen");
        veiculo.setModelo("Fusca");
        veiculo.setAnoFabricacao(1972);
        veiculo.setAnoModelo(1938);
        veiculo.setPotenciaMotor(50);
        repository.create(veiculo);

        veiculo = repository.read(1L);
        if (veiculo != null) {
            repository.delete(veiculo);
        }

        veiculo = repository.read(1L);

        Assert.assertTrue(veiculo == null);
    }
}

