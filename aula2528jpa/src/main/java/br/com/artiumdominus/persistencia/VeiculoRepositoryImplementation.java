package br.com.artiumdominus.persistencia;

import br.com.artiumdominus.model.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class VeiculoRepositoryImplementation implements VeiculoRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.com.artiumdominus");
    private EntityManager em;

    public VeiculoRepositoryImplementation() {
        em = emf.createEntityManager();
    }

    @Override
    public Veiculo create(Veiculo veiculo) {
        em.getTransaction().begin();
        em.persist(veiculo);
        em.getTransaction().commit();
        return veiculo;
    }

    @Override
    public Veiculo read(Long id) {
        Veiculo veiculo = em.find(Veiculo.class, id);
        return veiculo;
    }

    @Override
    public Veiculo update(Veiculo veiculo) {
        em.getTransaction().begin();
        veiculo = em.merge(veiculo);
        em.getTransaction().commit();
        return veiculo;
    }

    @Override
    public void delete(Veiculo veiculo) {
        em.getTransaction();
        em.remove(veiculo);
        em.getTransaction().commit();
    }

    @Override
    public void close() {
        emf.close();
    }
}
