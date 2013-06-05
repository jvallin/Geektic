package fr.jvallin.service;

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

import fr.jvallin.dao.GeekDao;
import fr.jvallin.model.Geek;

public class TestService
{
	public GeekDao dao;	
	private static EntityManagerFactory emFactory;
    private EntityManager em;
    
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
        dao = new GeekDao(em);
        em.getTransaction().begin();
    }
    
    @After
    public void tearDown() throws Exception {
        em.getTransaction().commit();
        em.close();
    }
    
    @Test
    public void testFindByPseudoCompletBalckangel() {
        List<Geek> listeGeek = dao.findByPseudo("Balckangel");
        assertEquals(1, listeGeek.size());
        assertEquals(1L, listeGeek.get(0).getId().longValue());
    }
    
    @Test
    public void testFindByPseudoLikeou() {
        List<Geek> listeGeek = dao.findByPseudo("ou");
        assertEquals(3, listeGeek.size());
    }
    
    @Test
    public void testFindById1() {
        Geek geek = dao.findById(1L);
        assertEquals("Balckangel", geek.getPseudo());
    }
    
    @Test
    public void testFindBySexeM() {
    	List<Geek> listeGeek = dao.findBySexe("M");
    	assertEquals(6, listeGeek.size());
    }
}