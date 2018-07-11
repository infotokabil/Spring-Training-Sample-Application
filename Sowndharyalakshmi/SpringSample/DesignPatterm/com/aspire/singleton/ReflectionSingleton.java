package com.aspire.singleton;

import java.lang.reflect.Constructor;

	public class ReflectionSingleton {

	    @SuppressWarnings("rawtypes")
		public static void main(String[] args) {
	       StaticSingleton instanceOne = StaticSingleton.getInstance();
	       StaticSingleton instanceTwo = null;
	        try {
	            Constructor[] constructors = StaticSingleton.class.getDeclaredConstructors();
	            for (Constructor constructor : constructors) {
	                //Below code will destroy the singleton pattern
	                constructor.setAccessible(true);
	                instanceTwo = (StaticSingleton) constructor.newInstance();
	                break;
	            }
	        } catch (Exception exception) {
	            exception.printStackTrace();
	        }
	        System.out.println(instanceOne);
	        System.out.println(instanceTwo);
	    }

	}

