package com.misteroo.module1.strategy;

import com.misteroo.module1.strategy.impl.LowercaseStrategy;
import com.misteroo.module1.strategy.impl.UppercaseStrategy;
import com.misteroo.module2.renderer.AbstractRenderer;
import com.misteroo.module2.renderer.impl.HtmlRenderer;

/**
 * Classe principale.
 * 
 * @author laurent
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractRenderer htmlRenderer = new HtmlRenderer();
		String username = args[1];
		
		AbstractStrategy uppercaseStrategy = new UppercaseStrategy();
		String value = uppercaseStrategy.write(username);
		System.out.println(htmlRenderer.renderer(value));

		AbstractStrategy lowercaseStrategy = new LowercaseStrategy();
		value = lowercaseStrategy.write(username);
		System.out.println(htmlRenderer.renderer(value));
	}

}
