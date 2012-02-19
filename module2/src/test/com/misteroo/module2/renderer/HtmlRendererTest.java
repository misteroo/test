package com.misteroo.module2.renderer;

import org.junit.Assert;
import org.junit.Test;

import com.misteroo.module2.renderer.impl.HtmlRenderer;

public class HtmlRendererTest {

	private HtmlRenderer htmlRenderer = new HtmlRenderer();
	
	@Test
	public void should_html_renderer() {
		String result = htmlRenderer.renderer("toto");
		Assert.assertEquals("<html><body><h2>toto</h2></body></html>", result);
	}
}
