package com.misteroo.module1.strategy.impl;

import com.misteroo.module1.strategy.AbstractStrategy;

/**
 * Strat�gie petite case.
 * 
 * @author laurent
 *
 */
public class LowercaseStrategy extends AbstractStrategy {

	@Override
	public String write(String username) {
		return "hello " + username.toLowerCase();
	}
}
