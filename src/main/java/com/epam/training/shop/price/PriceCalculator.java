package com.epam.training.shop.price;

import java.math.BigDecimal;

import com.epam.training.shop.model.Product;

public interface PriceCalculator {
	BigDecimal price(Product product);
	
	default int indetityHashCode() {
		return System.identityHashCode(this);
	}
}