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
        emFactory = Persistence.createEntityManagerFactory("GEEKTIC");
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
    public void testFindBySexeH() {
    	List<Geek> listeGeek = dao.findBySexe("H");
    	assertEquals(9, listeGeek.size());
    }
    
    @Test
    public void testFindBySexeHInteretJAVA() {
    	List<Geek> listeGeek = dao.findByInteret("H", "JAVA");
    	assertEquals(1, listeGeek.size());
    }
    
    @Test
    public void testFindBySexeDInteretHTML() {
    	List<Geek> listeGeek = dao.findByInteret("D", "HTML");
    	assertEquals(4, listeGeek.size());
    }
}