package com.epam.training.shop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.training.shop.price.PriceCalculator;
import com.epam.training.shop.store.Store;

public class Application {

	public static void start(Store store) {
		System.out.println(store.getStoreType() + ": ");
		store.open();
		store.printPrices();
		System.out.println("Stock: " + store.stock());
	}


	public static void main(String[] args) {
		try (AbstractApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml")) {
			Store store = context.getBean(Store.class);
			start(store);					
			
			PriceCalculator eightyPercentDPC = context.getBean("eightyPercentDPC", PriceCalculator.class);
			PriceCalculator eightyPercentDPC2 = context.getBean("eightyPercentDPC", PriceCalculator.class);
			System.out.println(eightyPercentDPC.indetityHashCode());
			System.out.println(eightyPercentDPC2.indetityHashCode());
			
		}
	}
}
