package jvallin.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;


/**
 * Entity implementation class for Entity: Interet
 */
@Entity
public class Interet {

	@Id
	@SequenceGenerator(name = "interet_generator", sequenceName = "INTERET_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "interet_generator")
	@Column(name = "ID")
	private Long id;
	
	private String libelle;


	
	@ManyToOne
	@JoinColumn(name = "id_geek", nullable = false)
	private Geek geek;
	
	

	public Interet() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Interet(String libelle) {
		super();
		this.libelle = libelle;
	}
	
	public Geek getGeek() {
		return geek;
	}

	public void setGeek(Geek geek) {
		this.geek = geek;
	}



}
