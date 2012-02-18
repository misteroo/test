package com.misteroo.module1.strategy.impl;

import com.misteroo.module1.strategy.AbstractStrategy;

public class UppercaseStrategy extends AbstractStrategy {

	@Override
	public String write(String username) {
		return "HELLO " + username.toUpperCase();
	}
}
