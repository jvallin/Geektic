package fr.jvallin.service;

import java.util.List;

import fr.jvallin.model.Geek;

public interface IService
{
	public List<Geek> findByPseudo(String pseudo);
	
	public void creer(String pseudo, String nom, String sexe);
	
	public List<Geek> findAll();
	
	public Geek findById(String id);
	
	public List<Geek> findBySexe(String sexe);
}