package org.primefaces.util.expression.impl;

import javax.faces.component.UIComponent;

import org.primefaces.util.expression.SearchExpressionResolver;

/**
 * {@link SearchExpressionResolver} for the "@all" keyword.
 */
public class AllExpressionResolver implements SearchExpressionResolver {

	public UIComponent resolve(UIComponent source, UIComponent last, String expression) {
		UIComponent parent = last.getParent();

		while (parent.getParent() != null) {
			parent = parent.getParent();
		}

		return parent;
	}
}
