package com.ninja_squad.iut.tpjpa.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.iut.tpjpa.model.Spectacle;
import com.ninja_squad.iut.tpjpa.model.TypeDeSpectacle;

public class SpectacleDaoTest {

	private static EntityManagerFactory emFactory;
	private EntityManager em;
	private SpectacleDao dao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		emFactory = Persistence.createEntityManagerFactory("TP_JPA");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		emFactory.close();
	}

	@Before
	public void setUp() throws Exception {
		em = emFactory.createEntityManager();
		dao = new SpectacleDao(em);
		loadTestData();
		em.getTransaction().begin();
	}

	private void loadTestData() {
		DbSetup dbSetup = new DbSetup(TestData.TEST_DESTINATION, 
				                      TestData.STANDARD_OPERATION);
		dbSetup.launch();
	}
	
	@After
	public void tearDown() throws Exception {
		em.getTransaction().commit();
		em.close();
	}
}
