package protoypePattern;

public class Demo {
	

		public static void main(String[] args) throws CloneNotSupportedException  {
			Library library = new Library();
			library.setShopName("Nila");
			library.loadData();
			System.out.println(library);
			
			//BookShop bs2= (BookShop)bookshop.clone();
			
			
			Library lib2=  library.clone();
			library.getBooks().remove(2);
			System.out.println(library.hashCode());
			
			System.out.println(library);
			System.out.println(lib2);

		}

	}

