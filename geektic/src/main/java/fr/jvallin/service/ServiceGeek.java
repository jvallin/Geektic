package fr.jvallin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.jvallin.dao.GeekDao;
import fr.jvallin.model.Spectacle;


@Service
@Transactional
public class ServiceGeek implements IService
{
	private GeekDao dao;
	
	@Autowired
	public ServiceGeek(GeekDao dao)
	{
		this.dao = dao;
	}
	
	public List<Spectacle> findByPseudo(String pseudo)
	{
		return dao.findByPseudo(pseudo);
	}
		
	// Méthode pour ajouter un Spectacle
	public void creer(String pseudo, String artiste, String sexe)
	{		
		dao.persist(new Spectacle(pseudo, artiste, sexe));
	}
	
	public List<Spectacle> findAll()
	{
		return dao.findAll();
	}
	
	public Spectacle findById(String id)
	{
		Long temp = Long.parseLong(id);
		
		return dao.findById(temp);
	}
	
	public List<Spectacle> findBySexe(String sexe)
	{
		return dao.findBySexe(sexe);
	}
}
