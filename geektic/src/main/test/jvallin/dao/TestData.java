package jvallin.dao;

import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.destination.Destination;
import com.ninja_squad.dbsetup.destination.DriverManagerDestination;
import com.ninja_squad.dbsetup.operation.Operation;

public class TestData
{
	public static final Destination TEST_DESTINATION = 
			new DriverManagerDestination("jdbc:hsqldb:hsql://localhost/GEEKTIC", "sa", "");
	
	public static final Operation STANDARD_OPERATION = 
		Operations.sequenceOf(
				Operations.deleteAllFrom("geek", "interet"),
				Operations.insertInto("geek")
				          .columns("id", "pseudo", "nom", "prenom", "sexe", "inscription")
				          .values(1L, "Balckangel", "VALLIN", "Jeremy", "M", "2013-03-28 21:00:00")
				          .values(2L, "Rafoufoun", "PANOYAN", "Rafi", "M", "2013-03-29 21:00:00")
				          .values(3L, "SebLaChaude", "CHANAL", "Sebastien", "F", "2013-02-28 21:00:00")
				          .build(),
				Operations.insertInto("interet")
				          .columns("id", "id_geek", "libelle")
				          .values(1L, 1L, "JAVA")
						  .values(2L, 1L, "Junit")
						  .values(3L, 2L, "HMTL")
						  .values(4L, 2L, "CSS")
				          .values(5L, 2L, "PHP")
						  .values(6L, 2L, "JS")
						  .values(7L, 3L, "Junit")
						  .values(8L, 3L, "CS")
				          .build());
}
