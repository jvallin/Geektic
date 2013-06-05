package fr.jvallin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.jvallin.dao.GeekDao;
import fr.jvallin.model.Geek;


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
	
	public List<Geek> findByPseudo(String pseudo)
	{
		return dao.findByPseudo(pseudo);
	}
		
	// Méthode pour ajouter un Geek
	public void creer(String pseudo, String nom, String sexe)
	{		
		dao.persist(new Geek(pseudo, nom, sexe));
	}
	
	public List<Geek> findAll()
	{
		return dao.findAll();
	}
	
	public Geek findById(String id)
	{
		Long temp = Long.parseLong(id);
		
		return dao.findById(temp);
	}
	
	public List<Geek> findBySexe(String sexe)
	{
		return dao.findBySexe(sexe);
	}
	
	public void updateNbVus(Geek geek)
	{
		dao.persist(geek);
	}
}
