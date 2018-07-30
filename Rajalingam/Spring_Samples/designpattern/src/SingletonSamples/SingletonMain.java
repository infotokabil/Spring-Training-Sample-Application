package SingletonSamples;

public class SingletonMain {

	public static void main(String[] args) {
		Lazy_initialization obj1 = Lazy_initialization.getInstance();
		Lazy_initialization.close();
		System.out.println("1");
		Lazy_initialization obj2=Lazy_initialization.getInstance();
		Lazy_initialization.close();
		System.out.println("2");
		System.out.println("Hashcode 1 :"+obj1.hashCode());
		System.out.println("Hashcode 2 :"+obj2.hashCode());
		System.out.println("Lazy_Initialization Completed");
		Eager_initialization obj3=Eager_initialization.getInstance();
		System.out.println(obj3.hashCode());

	}

}
