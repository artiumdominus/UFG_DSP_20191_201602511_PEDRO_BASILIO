package br.com.artiumdominus.persistencia;

import br.com.artiumdominus.model.Veiculo;
import org.apache.log4j.Logger;
import org.h2.tools.Server;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class ConsultaVeiculoTeste {

    Logger logger = Logger.getLogger(ConsultaVeiculoTeste.class.getName());

    Server server = null;
    VeiculoRepository repository;

    @BeforeTest
    public void setup() throws SQLException {
        server = Server.createTcpServer().start();
        repository = new VeiculoRepositoryImplementation();
    }

    @Test
    public void consultaPeloIdTeste() {
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Volkswagen");
        veiculo.setModelo("Fusca");
        veiculo.setAnoFabricacao(1972);
        veiculo.setAnoModelo(1938);
        veiculo.setPotenciaMotor(50);
        repository.create(veiculo);

        veiculo = repository.read(1L);
        System.out.println("Modelo do veiculo: " + veiculo.getModelo());
        Assert.assertTrue(veiculo != null);
    }
}
