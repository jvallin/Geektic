package jvallin.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jvallin.model.Geek;
import jvallin.model.Interet;

import org.springframework.stereotype.Component;


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
		String jpql = "select geek from Geek geek order by geek.pseudo";
		return em.createQuery(jpql, Geek.class).getResultList();
	}
	
	public void persist(Geek geek) {
		em.persist(geek);
	}
	
	public Geek findById(Long id) {
		return em.find(Geek.class, id);
	}
	
	public List<Geek> findByPseudo(String pseudo) {
		String jpql = 
			"select geek from Geek geek"
			+ " where lower(geek.pseudo) like :pseudo"
			+ " order by geek.pseudo";
		return em.createQuery(jpql, Geek.class)
				 .setParameter("pseudo", "%" + pseudo.toLowerCase() + "%")
				 .getResultList();
	}
	
	public List<Geek> findBySexe(String sexe) {
		String jpql = 
			"select geek from Geek geek"
			+ " where lower(geek.sexe) like :sexe"
			+ " order by geek.pseudo";
		return em.createQuery(jpql, Geek.class)
				 .setParameter("sexe", "%" + sexe.toLowerCase() + "%")
				 .getResultList();
	}	
	
	public List<Geek> findByInterets(List<Interet> interets) {
		String jpql = 
			"select geek from Geek geek"
			+ " where geek.interets IN (:interets)"
			+ " order by geek.pseudo";
		return em.createQuery(jpql, Geek.class)
				 .setParameter("interets",interets)
				 .getResultList();
	}
	
}
