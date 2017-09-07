package com.epam.training.shop.store;

import java.math.BigDecimal;

import com.epam.training.shop.data.DataStore;
import com.epam.training.shop.model.Product;
import com.epam.training.shop.price.PriceCalculator;

public class Store {

	private final DataStore<Product> dataStore;
	private final PriceCalculator priceCalculator;
	private final String storeType;

	public Store(DataStore<Product> dataStore, PriceCalculator priceCalculator, String storeType) {
		this.dataStore = dataStore;
		this.priceCalculator = priceCalculator;
		this.storeType = storeType;
	}

	public void open() {
		dataStore.add(new Product("Book", new BigDecimal("100")));
		dataStore.add(new Product("UberLaptop", new BigDecimal("10000")));
	}

	public void printPrices() {
		for (Product product : dataStore.list()) {
			System.out.println(product.getName() + ": " + priceCalculator.price(product));

		}
	}

	public BigDecimal stock() {
		BigDecimal sum = BigDecimal.ZERO;
		for (Product product : dataStore.list()) {
			sum = sum.add(priceCalculator.price(product));
		}
		return sum;
	}

	public String getStoreType() {
		return storeType;
	}

	

}
