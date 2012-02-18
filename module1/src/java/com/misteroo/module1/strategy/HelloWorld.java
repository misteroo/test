package com.misteroo.module1.strategy;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String username = args[1];
		UppercaseStrategy uppercaseStrategy = new UppercaseStrategy();
		String value = uppercaseStrategy.write(username);
		System.out.println(value);
	}

}
