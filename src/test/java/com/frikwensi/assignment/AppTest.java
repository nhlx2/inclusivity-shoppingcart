package com.frikwensi.assignment;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Fixture
     */
    private Cart cart;
    private Product dovesoap;
    private Product axedeo;
    private double taxrate;

    protected void setUp() {
	cart = new Cart();
	dovesoap = new Product("Dove Soap", 39.99);
	axedeo = new Product("Axe Deo", 99.99);
	taxrate = 12.5;
    }
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Step 1
     */
    public void testAddtoShoppingCart()
    {
	cart.add(dovesoap);
	cart.add(dovesoap);
	cart.add(dovesoap);
	cart.add(dovesoap);
	cart.add(dovesoap);
	assertEquals(cart.count(), 5);
	assertEquals(cart.total(), 199.95);
    }

    /**
     * Step 2
     */
    public void testAddAdditionalProductstoShoppingCart()
    {
	cart.add(dovesoap);
	cart.add(dovesoap);
	cart.add(dovesoap);
	cart.add(dovesoap);
	cart.add(dovesoap);
	cart.add(dovesoap);
	cart.add(dovesoap);
	cart.add(dovesoap);
	assertEquals(cart.count(), 8);
	assertEquals(cart.total(), 319.92);
    }

    /**
     * Step 3
     */
    public void testCalculateTaxRateofShoppingCartwithMultipleItems()
    {
	cart.add(dovesoap);
	cart.add(dovesoap);
	cart.add(axedeo);
	cart.add(axedeo);
	assertEquals(cart.count(), 4);
	assertEquals(cart.total(), 279.96);
	assertEquals(cart.total(taxrate), 314.96);
    }
}
