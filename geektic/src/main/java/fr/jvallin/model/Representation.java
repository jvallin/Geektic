package fr.jvallin.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Representation {
	
	@Id
	@SequenceGenerator(name = "representation_generator", sequenceName = "REPRESENTATION_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "representation_generator")
	private Long id;
	
	@Column(name = "date_representation")
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	private String libelle;
	
	@ManyToOne
	@JoinColumn(name = "id_spectacle", nullable = false)
	private Geek geek;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}
	
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Geek getSpectacle() {
		return geek;
	}

	public void setSpectacle(Geek geek) {
		this.geek = geek;
	}
}
