package fr.jvallin.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class InteretDao {

	@PersistenceContext
	private EntityManager em;
	
	public InteretDao()
	{
	}

	public InteretDao(EntityManager em) {
		this.em = em;
	}
	
	
}
