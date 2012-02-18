package com.misteroo.module1.strategy.impl;

import org.junit.Assert;
import org.junit.Test;

import com.misteroo.module1.strategy.impl.UppercaseStrategy;

public class UppercaseStrategyTest {

	@Test
	public void should_convert_to_uppercase() {
		UppercaseStrategy uppercaseStrategy = new UppercaseStrategy();
		String result = uppercaseStrategy.write("Mister Oo");
		Assert.assertEquals("HELLO MISTER OO", result);
	}
}
