package fr.jvallin.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import fr.jvallin.model.Geek;


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
	
	public List<Geek> findAll() {
		String jpql = "select g from Geek g order by g.pseudo";
		return em.createQuery(jpql, Geek.class).getResultList();
	}
	
	public void persist(Geek geek) {
		em.persist(geek);
	}
	
	public Geek findById(Long id) {
		return em.find(Geek.class, id);
	}
	
	public List<Geek> findByNom(String nom) {
		String jpql = 
			"select g from Geek g"
			+ " where lower(g.nom) like :nom"
			+ " order by g.pseudo";
		return em.createQuery(jpql, Geek.class)
				 .setParameter("nom", "%" + nom.toLowerCase() + "%")
				 .getResultList();
	}
	
	public List<Geek> findByPseudo(String pseudo) {
		String jpql = 
			"select g from Geek g"
			+ " where lower(g.pseudo) like :pseudo"
			+ " order by g.pseudo";
		return em.createQuery(jpql, Geek.class)
				 .setParameter("pseudo", "%" + pseudo.toLowerCase() + "%")
				 .getResultList();
	}
	
	public List<Geek> findBySexe(String sexe) {
		String jpql = 
			"select g from Geek g"
			+ " where lower(g.sexe) like :sexe"
			+ " order by g.pseudo";
		return em.createQuery(jpql, Geek.class)
				 .setParameter("sexe", "%" + sexe.toLowerCase() + "%")
				 .getResultList();
	}
}
