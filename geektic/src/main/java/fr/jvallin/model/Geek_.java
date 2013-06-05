package fr.jvallin.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


@Generated(value="Dali", date="2013-01-04T16:54:52.471+0100")
@StaticMetamodel(Geek_.class)
public class Geek_ {
	public static volatile SingularAttribute<Spectacle, Long> id;
	public static volatile SingularAttribute<Spectacle, String> pseudo;
	public static volatile SingularAttribute<Spectacle, String> artiste;
	public static volatile SingularAttribute<Spectacle, String> sexe;
	public static volatile SetAttribute<Spectacle, Representation> representations;
}
