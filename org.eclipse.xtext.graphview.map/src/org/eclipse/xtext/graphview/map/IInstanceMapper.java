package org.eclipse.xtext.graphview.map;

import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;

import com.google.inject.ImplementedBy;

@ImplementedBy(InstanceMapper.class)
public interface IInstanceMapper {

	void setClassLoader(ClassLoader classLoader);

	Object map(AbstractExpressionMapping mapping, Object thisElement);

}