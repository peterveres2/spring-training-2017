package com.epam.training.shop.price;

import java.math.BigDecimal;
import java.util.Random;

public class RandomDiscountPriceCalculator extends ConfigurableDiscountPriceCalculator {
	
	public RandomDiscountPriceCalculator() {
		 
		super(new BigDecimal((new Random().nextInt(25) + 75)).divide(new BigDecimal(100)));
	}

}
