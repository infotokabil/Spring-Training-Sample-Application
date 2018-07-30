package com.aspire.enumm;

public class Code {

	public static void main(String[] args) {
		String str = "HIGHest";
		Level level = Level.valueOf(str);

		System.out.println(level.getLevelCode());

	}

}
