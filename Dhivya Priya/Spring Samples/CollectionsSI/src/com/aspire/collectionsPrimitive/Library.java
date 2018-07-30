package com.aspire.collectionsPrimitive;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {
	
		private String libraryName;
		private List<String> bookTopics; // Allow Duplicates
		private Set<String> authors; // Not-Allow Duplicates
		private Map<Integer, String> books;
	 
		public String getLibraryName() {
			
			return libraryName;
		}
	 
		public void setLibraryName(String libraryName) {
			this.libraryName = libraryName;
		}
	 
		public List<String> getBookTopics() {
			return bookTopics;
		}
	 
		public void setBookTopics(List<String> topics) {
			this.bookTopics = topics;
		}
	 
		public Set<String> getAuthors() {
			return authors;
		}
	 
		public void setAuthors(Set<String> authors) {
			this.authors = authors;
		}
	 
		public Map<Integer, String> getBooks() {
			return books;
		}
	 
		public void setBooks(Map<Integer, String> books) {
			this.books = books;
		}
	}

