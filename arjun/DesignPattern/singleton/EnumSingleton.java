package com.aspiresys.designpattern;


	public enum EnumSingleton  {
	    INSTANCE;
		 public String s;
		private EnumSingleton() {
			s="hello singleTon";
	    }
		public  String display()
		{
			return "Display";
		}
}