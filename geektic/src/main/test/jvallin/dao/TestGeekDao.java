package jvallin.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import junit.framework.TestCase;
import jvallin.model.Geek;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestGeekDao 
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
    public void testFindByPseudoBalckangel() {
        List<Geek> listeGeek = dao.findByPseudo("Balckangel");
        assertEquals(1, listeGeek.size());
        assertEquals(1L, listeGeek.get(0).getId().longValue());
    }
    
    @Test
    public void test() {
    }
    
    

}
