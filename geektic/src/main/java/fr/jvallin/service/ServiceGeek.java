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
	
	public List<Spectacle> findByTitre(String titre)
	{
		return dao.findByTitre(titre);
	}
		
	// Méthode pour ajouter un Spectacle
	public void creer(String titre, String artiste, String type)
	{		
		dao.persist(new Spectacle(titre, artiste, type));
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
