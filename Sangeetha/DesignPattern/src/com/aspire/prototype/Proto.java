package com.aspire.prototype;

public class Proto
{

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bookshop = new BookShop();
		bookshop.setShopName("Nila");
		bookshop.loadData();
		System.out.println(bookshop);
		
		BookShop bs2= bookshop.clone();
		bookshop.getBooks().remove(2);
		System.out.println(bookshop.hashCode());
		System.out.println(bookshop);
		System.out.println(bs2);

	}

}
