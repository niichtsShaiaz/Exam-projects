/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA2;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import JPA2.Book;

/**
 *
 * @author Mathias
 */
public class Facade {

    EntityManagerFactory emf;

    public Facade() {
        this.emf = Persistence.createEntityManagerFactory("Elias-database");
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void createBook(int isbn, String Title, String Author, Long price) {
        Book book = new Book(isbn, Author, Title, price);
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
    }
    public void createEBook(int isbn, String Title, String Author, Long price, String downloadURL, Long sizeMB) {
        EBook ebook = new EBook(downloadURL, sizeMB, price, isbn, Author, Title, price);
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(ebook);
        em.getTransaction().commit();
    }
    public void createPaperBook(int isbn, String Title, String Author, Long price, boolean inStock, Long shippingWeight) {
        PaperBook paperbook = new PaperBook(shippingWeight, inStock, price, isbn, Author, Title, price);
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(paperbook);
        em.getTransaction().commit();
    }
}
