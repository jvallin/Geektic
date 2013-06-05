package fr.jvallin.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-01-04T16:54:52.264+0100")
@StaticMetamodel(Representation.class)
public class Interet_ {
	public static volatile SingularAttribute<Representation, Long> id;
	public static volatile SingularAttribute<Representation, Date> date;
	public static volatile SingularAttribute<Representation, String> libelle;
	public static volatile SingularAttribute<Representation, Geek> geek;
}
