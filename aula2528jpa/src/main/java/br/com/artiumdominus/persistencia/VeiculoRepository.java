package br.com.artiumdominus.persistencia;

import br.com.artiumdominus.model.Veiculo;

public interface VeiculoRepository {
    /**
     *  Create a new veicle
     *
     * @param veiculo
     * @return Veiculo
     */
    Veiculo create(Veiculo veiculo);

    /**
     *  Read veicle by id
     *
     * @param id
     * @return Veiculo
     */
    Veiculo read(Long id);

    /**
     *  Update veicle
     *
     * @param veiculo
     * @return Veiculo
     */
    Veiculo update(Veiculo veiculo);

    /**
     * Delete veicle
     *
     * @param veiculo
     */
    void delete(Veiculo veiculo);

    /**
     * close the model manager factory
     */
    void close();
}
