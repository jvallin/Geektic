package jvallin.model;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Entity implementation class for Entity: Geek
 */
@Entity
public class Geek {

	@Id
	@SequenceGenerator(name = "geek_generator", sequenceName = "GEEK_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "geek_generator")
	@Column(name = "ID")
	private Long id;
	
	private String pseudo;
	private String nom;
	private String prenom;
	private String sexe;
	
	@Column(name = "inscription")
	@Temporal(TemporalType.TIMESTAMP)
	private Date inscription;
	
	

	
	@OneToMany(mappedBy = "geek")
	private Set<Interet> interets = new HashSet<Interet>(0);
	
	public Geek() {
	}
	
	

	public Geek(String pseudo, String nom, String prenom, String sexe,
			Date inscription) {
		super();
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.inscription = inscription;
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


	public Date getInscription() {
		return inscription;
	}


	public void setInscription(Date inscription) {
		this.inscription = inscription;
	}


	public Set<Interet> getInterets() {
		return interets;
	}

	public void setInterets(Set<Interet> interets) {
		this.interets = interets;
	}

	public Set<Interet> getRepresentations() {
		return Collections.unmodifiableSet(interets);
	}
	
	public void addRepresentation(Interet interet) {
		interet.setGeek(this);
		interets.add(interet);
	}
}
