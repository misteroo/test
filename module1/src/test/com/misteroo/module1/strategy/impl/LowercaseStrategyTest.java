package com.misteroo.module1.strategy.impl;

import org.junit.Assert;
import org.junit.Test;

public class LowercaseStrategyTest {

	@Test
	public void should_convert_to_lowercase() {
		LowercaseStrategy strategy = new LowercaseStrategy();
		String result = strategy.write("Mister Oo");
		Assert.assertEquals("hello mister oo", result);
	}
}
