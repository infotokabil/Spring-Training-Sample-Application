package enumSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo {
	public static void main(String[] args) {
		EnumSingleton singleton = EnumSingleton.OBJECT;
		System.out.println(singleton.hashCode());
		EnumSingleton singleton1 = EnumSingleton.OBJECT;
		System.out.println(singleton1.hashCode());
		try {
			Constructor constructor = singleton.getClass().getDeclaredConstructor();
			constructor.setAccessible(true);
			EnumSingleton single = (EnumSingleton) constructor.newInstance();
			System.out.println(single.hashCode());
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SingletonObject obj = SingletonObject.getInstance();

		try {
			Constructor constructor = SingletonObject.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			SingletonObject obj2 = (SingletonObject) constructor.newInstance();

			System.out.println("OBJ: " + obj);
			System.out.println("OBJ2: " + obj2);

		} catch (Exception exception) {
			
			exception.printStackTrace();
		} 

		/* SingletonObject obj1=SingletonObject.getInstance();
		 System.out.println(obj1);
		 SingletonObject obj3=SingletonObject.class.getDeclaredConstructor()
		 System.out.println(obj3);*/
	}

}
