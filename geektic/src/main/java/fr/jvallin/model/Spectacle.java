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
	@Column(name = "ID_SPECTACLE")
	private Long id;
	
	private String titre;
	
	private String artiste;
	
	private String prenom;
	
	private String type;
	
	@OneToMany(mappedBy = "spectacle")
	private Set<Representation> representations = new HashSet<>(0);
	
	public Spectacle() {
	}
	
	public Spectacle(String titre, String artiste, String type) {
		this.titre = titre;
		this.artiste = artiste;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getArtiste() {
		return artiste;
	}

	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Set<Representation> getRepresentations() {
		return Collections.unmodifiableSet(representations);
	}
	
	public void addRepresentation(Representation representation) {
		representation.setSpectacle(this);
		representations.add(representation);
	}
}
