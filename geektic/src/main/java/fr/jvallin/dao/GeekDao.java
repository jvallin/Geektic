package fr.jvallin.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import fr.jvallin.model.Spectacle;


@Component
public class GeekDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public GeekDao()
	{
	}

	public GeekDao(EntityManager em) {
		this.em = em;
	}
	
	public List<Spectacle> findAll() {
		String jpql = "select g from Spectacle g order by g.pseudo";
		return em.createQuery(jpql, Spectacle.class).getResultList();
	}
	
	public void persist(Spectacle spectacle) {
		em.persist(spectacle);
	}
	
	public Spectacle findById(Long id) {
		return em.find(Spectacle.class, id);
	}
	
	public List<Spectacle> findByNom(String nom) {
		String jpql = 
			"select g from Spectacle g"
			+ " where lower(g.nom) like :nom"
			+ " order by g.pseudo";
		return em.createQuery(jpql, Spectacle.class)
				 .setParameter("nom", "%" + nom.toLowerCase() + "%")
				 .getResultList();
	}
	
	public List<Spectacle> findByPseudo(String pseudo) {
		String jpql = 
			"select g from Spectacle g"
			+ " where lower(g.pseudo) like :pseudo"
			+ " order by g.pseudo";
		return em.createQuery(jpql, Spectacle.class)
				 .setParameter("pseudo", "%" + pseudo.toLowerCase() + "%")
				 .getResultList();
	}
	
	public List<Spectacle> findBySexe(String sexe) {
		String jpql = 
			"select g from Spectacle g"
			+ " where lower(g.sexe) like :sexe"
			+ " order by g.pseudo";
		return em.createQuery(jpql, Spectacle.class)
				 .setParameter("sexe", "%" + sexe.toLowerCase() + "%")
				 .getResultList();
	}
}
