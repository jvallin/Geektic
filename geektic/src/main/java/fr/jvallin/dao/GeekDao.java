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
		String jpql = "select spectacle from Spectacle spectacle order by spectacle.titre";
		return em.createQuery(jpql, Spectacle.class).getResultList();
	}
	
	public void persist(Spectacle spectacle) {
		em.persist(spectacle);
	}
	
	public Spectacle findById(Long id) {
		return em.find(Spectacle.class, id);
	}
	
	public List<Spectacle> findByArtiste(String artiste) {
		String jpql = 
			"select spectacle from Spectacle spectacle"
			+ " where lower(spectacle.artiste) like :artiste"
			+ " order by spectacle.titre";
		return em.createQuery(jpql, Spectacle.class)
				 .setParameter("artiste", "%" + artiste.toLowerCase() + "%")
				 .getResultList();
	}
	
	public List<Spectacle> findByTitre(String titre) {
		String jpql = 
			"select spectacle from Spectacle spectacle"
			+ " where lower(spectacle.titre) like :titre"
			+ " order by spectacle.titre";
		return em.createQuery(jpql, Spectacle.class)
				 .setParameter("titre", "%" + titre.toLowerCase() + "%")
				 .getResultList();
	}
	
	public List<Spectacle> findBySexe(String sexe) {
		String jpql = 
			"select spectacle from Spectacle spectacle"
			+ " where lower(spectacle.type) like :sexe"
			+ " order by spectacle.titre";
		return em.createQuery(jpql, Spectacle.class)
				 .setParameter("sexe", "%" + sexe.toLowerCase() + "%")
				 .getResultList();
	}
}
