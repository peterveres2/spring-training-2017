package com.epam.training.shop.price;

import java.math.BigDecimal;

import com.epam.training.shop.model.Product;

public class ConfigurableDiscountPriceCalculator implements PriceCalculator {
	
	private final BigDecimal discount;
	
	public ConfigurableDiscountPriceCalculator(BigDecimal discount) {
		super();
		this.discount = discount;
	}

	public BigDecimal price(Product product) {
		return product.getPrice().multiply(discount);
	}
	

	
}
