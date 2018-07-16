package com.aspire.adapter;

public class FoodOrdering {

	public static void main(String[] args) {

		
		 VegImpl veg = new VegImpl();
		 NonVegImpl nonveg = new NonVegImpl();
      
        Veg foodadapter = new FoodAdapter(nonveg);
 
        System.out.println("veg...");
        veg.prepareEggFry();
        
        System.out.println("nonveg...");
        nonveg.prepareEgg();
 
        System.out.println("Food adapter...");
        foodadapter.prepareEggFry();
		
	}

}
