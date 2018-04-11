package streaming.tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Test;
import streaming.entity.Film;

/**
 *
 * @author renob
 */
public class NewEmptyJUnitTest {
    
        //Persistence.createEntityManagerFactory("PU");
    @Test
    public void demarre() {
        
        EntityManagerFactory f = Persistence.createEntityManagerFactory("PU");
//        EntityManager em = f.createEntityManager();
//        em.getTransaction().begin();
//        Film film = new Film();
//        film.setTitre("Transpotting");
//        film.setDateSortie(new Date());
//        em.persist(film);
//        
//        em.getTransaction().commit();
    }
    
}
