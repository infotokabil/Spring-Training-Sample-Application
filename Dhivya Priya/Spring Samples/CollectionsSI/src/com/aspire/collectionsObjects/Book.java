package com.aspire.collectionsObjects;

import java.util.List;

public class Book {
	
		private String topicName;
		private List<Topic> bookList;
		
		public String getTopicName() {
			return topicName;
		}
		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}
		public List<Topic> getBookList() {
			return bookList;
		}
		public void setBookList(List<Topic> books) {
			this.bookList = books;
		}	 
	}

