package com.aspire.factorypatterm;

import org.junit.Test;

public class PizzaFactoryTest {
    @SuppressWarnings("unused")
	@Test
    public void testMakePizzas(){
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}