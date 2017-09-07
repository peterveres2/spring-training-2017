package com.epam.training.shop.price;

import java.math.BigDecimal;

import com.epam.training.shop.model.Product;

public class ExclusivePriceCalculator implements PriceCalculator {

	public BigDecimal price(Product product) {
		return product.getPrice().multiply(new BigDecimal("2"));
	}

}
