package com.epam.training.shop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.epam.training.shop.store.Store;

public class Application {

	public static void start(Store store) {
		System.out.println(store.getStoreType() + ": ");
		store.open();
		store.printPrices();
		System.out.println("Stock: " + store.stock());
	}


	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		Store store = factory.getBean(Store.class);
		start(store);		
	}
}
