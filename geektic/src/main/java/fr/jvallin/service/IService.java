package fr.jvallin.service;

import java.util.List;

import fr.jvallin.model.Spectacle;

public interface IService
{
	public List<Spectacle> findByTitre(String titre);
	
	public void creer(String titre, String artiste, String type);
	
	public List<Spectacle> findAll();
	
	public Spectacle findById(String id);
	
	public List<Spectacle> findBySexe(String sexe);
}
