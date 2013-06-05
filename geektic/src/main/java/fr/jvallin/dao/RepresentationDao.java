package fr.jvallin.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import fr.jvallin.model.Representation;
import fr.jvallin.model.RepresentationSearchCriteria;
import fr.jvallin.model.Interet_;
import fr.jvallin.model.Spectacle;
import fr.jvallin.model.Geek_;

public class RepresentationDao {
	private EntityManager em;

	public RepresentationDao(EntityManager em) {
		this.em = em;
	}
	
	public List<Representation> findByCriteria(RepresentationSearchCriteria criteria) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Representation> cq = cb.createQuery(Representation.class);
		Root<Representation> representation = cq.from(Representation.class);
		Path<Spectacle> spectacle = representation.join(Interet_.spectacle);
		Predicate dateAfter = cb.greaterThanOrEqualTo(representation.get(Interet_.date), criteria.getDateDebut());
		Predicate dateBefore = cb.lessThanOrEqualTo(representation.get(Interet_.date), criteria.getDateFin());
		Predicate likeNom = cb.like(cb.lower(spectacle.get(Geek_.nom)), "%" + criteria.getArtiste().toLowerCase() + "%");
		
		cq.where(dateBefore, dateAfter, likeNom);
		representation.fetch(Interet_.spectacle);
		cq.select(representation).orderBy(cb.asc(representation.get(Interet_.date)));
		return em.createQuery(cq).getResultList();
	}
	
	public List<Representation> findByCriteriaUsingJPQL(RepresentationSearchCriteria criteria) {
		String jpql = 
			"select representation from Representation representation"
			+ " inner join fetch representation.spectacle spectacle"
			+ " where representation.date >= :dateDebut"
			+ " and representation.date <= :dateFin"
			+ " and lower(spectacle.artiste) like :artiste"
			+ " order by representation.date";
		return em.createQuery(jpql, Representation.class)
				 .setParameter("dateDebut", criteria.getDateDebut())
				 .setParameter("dateFin", criteria.getDateFin())
				 .setParameter("artiste", "%" + criteria.getArtiste().toLowerCase() + "%")
				 .getResultList();
	}
}
