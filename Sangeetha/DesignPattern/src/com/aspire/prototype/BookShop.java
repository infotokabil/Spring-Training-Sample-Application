package com.aspire.prototype;

import java.util.List;
import java.util.ArrayList;

public class BookShop implements Cloneable{
	
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
		for(int i=1;i<=10;i++)
		{
			Book book=new Book();
			book.setBookId(i);
			book.setBookName("Book"+i);
			getBooks().add(book);
		}
	}
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	
	public BookShop clone() throws CloneNotSupportedException
	{
		
		BookShop bookshop = new BookShop();
		for(Book book : this.getBooks())
		{
			bookshop.getBooks().add(book);
		}
		return bookshop;
	}
	
	

}
