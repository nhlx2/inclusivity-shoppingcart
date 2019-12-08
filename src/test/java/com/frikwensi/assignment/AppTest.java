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

    protected void setUp() {
	cart = new Cart();
	dovesoap = new Product("Dove Soap", 39.99);
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
}
