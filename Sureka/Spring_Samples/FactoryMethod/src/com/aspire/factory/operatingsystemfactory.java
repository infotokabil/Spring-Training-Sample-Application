package com.aspire.factory;

public class operatingsystemfactory {
OS o=null;
	public OS getinstance(String str) {
		if (str.equalsIgnoreCase("windows"))
			return new windows();
		else if (str.equalsIgnoreCase("ubuntu"))
			return new ubuntu();
		else
			return new ios();
	}

}
