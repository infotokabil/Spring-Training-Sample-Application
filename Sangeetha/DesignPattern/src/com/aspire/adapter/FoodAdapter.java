package com.aspire.adapter;

public class FoodAdapter implements Veg{
	NonVeg nonveg;

	public FoodAdapter(NonVeg nonveg) {
		
		this.nonveg=nonveg;
	}
	@Override
	public void prepareEggFry() {
		// TODO Auto-generated method stub
		System.out.println("adapter");
		nonveg.prepareEgg();
		
	}
	
}
