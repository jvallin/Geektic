package fr.jvallin.service;

import java.util.List;

import fr.jvallin.model.Spectacle;

public interface IService
{
	public List<Spectacle> findByPseudo(String pseudo);
	
	public void creer(String pseudo, String nom, String sexe);
	
	public List<Spectacle> findAll();
	
	public Spectacle findById(String id);
	
	public List<Spectacle> findBySexe(String sexe);
}
