package com.epam.training.shop.data;

public interface DataStore<T> {

	public void add(T t);

	public Iterable<T> list();

	
}