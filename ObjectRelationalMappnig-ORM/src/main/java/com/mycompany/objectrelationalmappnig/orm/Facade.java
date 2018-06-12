/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.objectrelationalmappnig.orm;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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

    public void createCustomer(String name, String email) {
        Customer customer = new Customer(name, email);
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();
    }

    public Customer getCustomer(String email) {
        Customer customer = null;
        EntityManager em = getEntityManager();
        Query q = em.createQuery("SELECT c FROM Customer c WHERE c.email = :hej");
        q.setParameter("hej", email);
        customer = (Customer) q.getSingleResult();
        return customer;
    }

    public List<Customer> getAllCustomers() {
        List<Customer> list = new ArrayList<Customer>();
        EntityManager em = getEntityManager();
        Query q = em.createQuery("SELECT c FROM Customer c");
        list = (List<Customer>) q.getResultList();
        return list;
    }

    public void createOrder(long customerId) {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Customer customer = em.getReference(Customer.class, customerId);
        Orderr o = new Orderr(customer);
        o.setCustomer(customer);
        em.persist(o);
        em.getTransaction().commit();
    }

    public Orderr getOrder(long orderId) {
        Orderr order = null;
        EntityManager em = getEntityManager();
        Query q = em.createQuery("SELECT o FROM Orderr o WHERE o.id = :orderId");
        q.setParameter("orderId", orderId);
        order = (Orderr) q.getSingleResult();
        return order;
    }

    public void createItemType() {
        ItemType item = new ItemType("Some item", "This is some kind of item", 25);
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(item);
        em.getTransaction().commit();
    }

    public void createOrderLine(long orderId, long itemId) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Orderr order = em.getReference(Orderr.class, orderId);
        ItemType iT = em.getReference(ItemType.class, itemId);
        OrderLine oL = new OrderLine(5, iT, order);
        em.persist(oL);
        em.getTransaction().commit();
    }

    public int getOrderPrice(long orderId) {
        int price = 0;
        EntityManager em = getEntityManager();
        Orderr order = em.getReference(Orderr.class, orderId);
        Query q = em.createQuery("SELECT ol FROM OrderLine ol WHERE :orderId = ol.order");
        q.setParameter("orderId", order);
        List<OrderLine> orderLines = (List<OrderLine>) q.getResultList();
        for (OrderLine item : orderLines) {
            price += item.getQuanitiy() * item.getItemType().getPrice();
        }

        //price = orderLine.getQuanitiy() * orderLine.getItemType().getPrice();
        return price;
    }
}
