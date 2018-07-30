package protoypePattern;

import java.util.ArrayList;
import java.util.List;

public class Library implements Cloneable{

	private String shopName;
	List<Book> books = new ArrayList<>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadData()
	{
		for(int i=1;i<=5;i++)
		{
			Book book=new Book();
			//System.out.println(book.hashCode());
			book.setBookId(i);
			book.setBookName("Book"+i);
			books.add(book);
		}
	}
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	/*@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}*/
	
	public Library clone() throws CloneNotSupportedException 
	{
		
		Library shop = new Library();
		for(Book book : books)
		{
			shop.books.add(book);
		}
		return shop;
	}
}

