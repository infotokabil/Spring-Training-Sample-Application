package com.aspire.singleton;

public class SingletonExample {

	private static SingletonExample singletonInstance;

	private SingletonExample() {

	}

	// Providing Global point of access

	/*public static SingletonExample getSingletonInstance() {

		if (null == singletonInstance) {

			singletonInstance = new SingletonExample();

		}
		return singletonInstance;

	}*/
/*	public static synchronized SingletonExample getSingletonInstance() {

        if (null == singletonInstance) {

            singletonInstance = new SingletonExample();

        }

        return singletonInstance;

    }*/
	public static SingletonExample getSingletonInstance() {

		
        if (null == singletonInstance) {

            synchronized (SingletonExample.class){

                    if (null == singletonInstance) {

            singletonInstance = new SingletonExample();

            }

        }

        }

        return singletonInstance;

    }
	

}
