package onetomany_xml.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomany_xml.dto.Cart;

public class CartDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shree");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveCart(Cart cart) {

		entityTransaction.begin();
		entityManager.persist(cart);
		entityTransaction.commit();
	}
}
