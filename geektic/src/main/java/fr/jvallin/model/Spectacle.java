package fr.jvallin.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


/**
 * Entity implementation class for Entity: Spectacle
 */
@Entity
public class Spectacle {

	@Id
	@SequenceGenerator(name = "spectacle_generator", sequenceName = "SPECTACLE_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "spectacle_generator")
	private Long id;
	
	private String pseudo;
	
	private String nom;
	
	private String prenom;
	
	private String sexe;
	
	@OneToMany(mappedBy = "spectacle")
	private Set<Representation> representations = new HashSet<>(0);
	
	public Spectacle() {
	}
	
	public Spectacle(String pseudo, String nom, String sexe) {
		this.pseudo = pseudo;
		this.nom = nom;
		this.sexe = sexe;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public Set<Representation> getRepresentations() {
		return Collections.unmodifiableSet(representations);
	}
	
	public void addRepresentation(Representation representation) {
		representation.setSpectacle(this);
		representations.add(representation);
	}
}
