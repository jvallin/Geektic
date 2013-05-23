package jvallin.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jvallin.model.Geek;
import jvallin.model.Interet;

import org.springframework.stereotype.Component;


@Component
public class InteretDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public InteretDao()
	{
	}

	public InteretDao(EntityManager em) {
		this.em = em;
	}
	
	public List<Interet> findAll() {
		String jpql = "select interet from Interet interet order by interet.libelle";
		return em.createQuery(jpql, Interet.class).getResultList();
	}
	
	public void persist(Interet interet) {
		em.persist(interet);
	}
	
	public Interet findById(Long id) {
		return em.find(Interet.class, id);
	}
	
	public List<Interet> findInteretByGeek(Geek geek) {
		String jpql = 
			"select interet from Interet interet"
			+ " where interet.geek = :geek"
			+ " order by interet.libelle";
		return em.createQuery(jpql, Interet.class)
				 .setParameter("geek", geek.getId())
				 .getResultList();
	}
	
	
}
