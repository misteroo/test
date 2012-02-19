package com.misteroo.module1.strategy.impl;

import com.misteroo.module1.strategy.AbstractStrategy;

/**
 * Stratégie grande case.
 * 
 * @author laurent
 *
 */
public class UppercaseStrategy extends AbstractStrategy {

	@Override
	public String write(String username) {
		return "HELLO " + username.toUpperCase();
	}
}
