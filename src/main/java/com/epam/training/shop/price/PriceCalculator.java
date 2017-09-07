package com.epam.training.shop.price;

import java.math.BigDecimal;

import com.epam.training.shop.model.Product;

public interface PriceCalculator {
	public BigDecimal price(Product product);
}