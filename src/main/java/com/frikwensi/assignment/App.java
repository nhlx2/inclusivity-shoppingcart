package com.frikwensi.assignment;

import java.util.*;

class Cart {
    private Product[] products;
    Cart() {
	products = new Product[0];
    }
    void add(Product prod) {
	List<Product> prodlist = new ArrayList<Product>(Arrays.asList(products));
	prodlist.add(prod);
	products = prodlist.toArray(products);
    }
    double total() {
	double total = 0;
	for (int i = 0; i < products.length; i++) {
	    total = total + products[i].getPrice();
	}
	return (double) Math.round(total * 100) / 100;
    }
    double total(double taxrate) {
	double totalwithtax;
	totalwithtax = total() + (taxrate/100)*total();
	return (double) Math.round(totalwithtax * 100) / 100;
    }
    int count() { return products.length; }
}


class Product {
    private String description;
    private double price;

    Product(String desc, double p) { description = desc; price = p; }

    double getPrice() {	return price; }

    String getDescription() { return description; }
    
}

