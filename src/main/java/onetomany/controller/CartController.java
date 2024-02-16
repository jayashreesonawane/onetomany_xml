package onetomany.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import onetomany_xml.dao.CartDao;
import onetomany_xml.dto.Cart;

public class CartController {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("onetomany.xml");

		Cart cart = applicationContext.getBean("cart", Cart.class);
		CartDao cartDao = applicationContext.getBean("dao", CartDao.class);

		cartDao.saveCart(cart);
	}
}
