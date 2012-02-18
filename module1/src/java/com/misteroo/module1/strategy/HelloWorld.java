package com.misteroo.module1.strategy;

import com.misteroo.module1.strategy.impl.LowercaseStrategy;
import com.misteroo.module1.strategy.impl.UppercaseStrategy;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String username = args[1];
		UppercaseStrategy uppercaseStrategy = new UppercaseStrategy();
		String value = uppercaseStrategy.write(username);
		System.out.println(value);

		LowercaseStrategy lowercaseStrategy = new LowercaseStrategy();
		value = lowercaseStrategy.write(username);
		System.out.println(value);
	}

}
