package com.ninja_squad.iut.tpjpa.dao;

import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.destination.Destination;
import com.ninja_squad.dbsetup.destination.DriverManagerDestination;
import com.ninja_squad.dbsetup.operation.Operation;
import com.ninja_squad.iut.tpjpa.model.TypeDeSpectacle;

public class TestData {
	public static final Destination TEST_DESTINATION = 
			new DriverManagerDestination("jdbc:hsqldb:hsql://localhost/TP_JPA", "sa", "");
	
	public static final Operation STANDARD_OPERATION = 
		Operations.sequenceOf(
				Operations.deleteAllFrom("representation", "spectacle"),
				Operations.insertInto("spectacle")
				          .columns("id", "titre", "artiste", "type")
				          .values(1L, "Dernier coup de ciseaux", "Troupe des Mathurins", TypeDeSpectacle.THEATRE)
						  .values(2L, "Black City Tour 2", "Indochine", TypeDeSpectacle.CONCERT)
				          .build(),
				Operations.insertInto("representation")
				          .columns("id", "date_representation", "id_spectacle")
				          .values(1L, "2013-02-28 21:00:00", 2L)
						  .values(2L, "2013-03-02 20:30:00", 2L)
						  .values(3L, "2013-03-05 20:00:00", 2L)
						  .values(4L, "2013-02-28 19:00:00", 1L)
				          .build());
}
