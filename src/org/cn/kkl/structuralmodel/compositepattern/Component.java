package org.cn.kkl.structuralmodel.compositepattern;

/**
 * @author Admin
 * abstract component
 */
public interface Component {
	
	void operate();
}

/**
 * @author Admin
 * leaf node or leaf component
 */
interface Leaf extends Component{}

/**
 * @author Admin
 * composite node or composite component
 */
interface Composite extends Component{
	
	void add(Component component);
	
	void remove(Component component);
	
	Component getComponent(int index);
	
}