package com.misteroo.module2.renderer.impl;

import com.misteroo.module2.renderer.AbstractRenderer;

public class HtmlRenderer extends AbstractRenderer {

	@Override
	public String renderer(String value) {
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<body>");
		sb.append("<h2>" + value + "</h2>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}

}
