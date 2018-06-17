package org.cn.kkl.structuralmodel.adapterpattern;

/**
 * @author Admin
 * achieve adapter by class extend
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void handleRequest() {
		super.dealRequest();
	}

}
