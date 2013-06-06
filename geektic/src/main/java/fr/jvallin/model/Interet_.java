package fr.jvallin.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-01-04T16:54:52.264+0100")
@StaticMetamodel(Interet.class)
public class Interet_ {
	public static volatile SingularAttribute<Interet, Long> id;
	public static volatile SingularAttribute<Interet, String> libelle;
	public static volatile SingularAttribute<Interet, Geek> geek;
}
