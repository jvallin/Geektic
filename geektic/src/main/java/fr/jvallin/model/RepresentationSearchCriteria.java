package fr.jvallin.model;

import java.util.Date;

public class RepresentationSearchCriteria {
	
	private final Date dateDebut;
	private final Date dateFin;
	private final String artiste;
	
	public RepresentationSearchCriteria(Date dateDebut, 
			                            Date dateFin,
			                            String artiste) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.artiste = artiste;
	}
	
	public Date getDateDebut() {
		return dateDebut;
	}
	
	public Date getDateFin() {
		return dateFin;
	}
	
	public String getArtiste() {
		return artiste;
	}
}
