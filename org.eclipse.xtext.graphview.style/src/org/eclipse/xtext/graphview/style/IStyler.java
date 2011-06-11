package org.eclipse.xtext.graphview.style;

import org.eclipse.xtext.graphview.style.graphViewStyle.Style;

import com.google.inject.ImplementedBy;

@ImplementedBy(Styler.class)
public interface IStyler {

	boolean style(Object o, Style style);

	void setClassLoader(ClassLoader classLoader);

}
