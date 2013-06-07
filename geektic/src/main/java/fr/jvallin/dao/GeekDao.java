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
	
	public Geek findMaxVues() {
		String jpql = "select g from Geek g where g.nbvus = (select max(nbvus) from Geek)";
		return em.createQuery(jpql, Geek.class).setMaxResults(1).getSingleResult();
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
	
	public List<Geek> findByInteret(String sexe, String[] listInterets) {
		
		String interets = "";
		
		if(listInterets != null)
		{
			for(int i=0; i<listInterets.length-1; i++)
			{
				interets += ""+listInterets[i]+"";
				interets += ",";
			}
			
			interets += ""+listInterets[listInterets.length-1] + "";
		}
		
		System.out.println(interets);
		
		String jpql = "select g from Geek g";		
		
		if(!interets.equals("")) // si il y a au moins un interet
		{
			jpql += " join g.interets i";
			jpql += " where lower(i.libelle) in (:interet) ";
			if(!sexe.equals("D")) // si un sexe est spécifié
			{
				jpql += " and lower(g.sexe) = :sexe";
				jpql += " order by g.pseudo";
				return em.createQuery(jpql, Geek.class)
						 .setParameter("sexe", "" + sexe.toLowerCase() + "")	
						 .setParameter("interet", "" + interets.toLowerCase() + "")		
						 .getResultList();
	   		}
			
			jpql += " order by g.pseudo";
			
			List<Geek> liste = em.createQuery(jpql, Geek.class)	
					 .setParameter("interet", "" + interets.toLowerCase() + "")		
					 .getResultList();
			System.out.println(liste);
			return liste;
		}		
		else
		{
			if(!sexe.equals("D")) // si un sexe est spécifié
			{
				jpql += " where lower(g.sexe) = :sexe";
				
				jpql += " order by g.pseudo";
				return em.createQuery(jpql, Geek.class)
						 .setParameter("sexe", "" + sexe.toLowerCase() + "")		
						 .getResultList();
	   		}
			
			jpql += " order by g.pseudo";
			return em.createQuery(jpql, Geek.class)
					 .getResultList();
		}
	}
}
