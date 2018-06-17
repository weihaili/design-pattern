package org.cn.kkl.structuralmodel.adapterpattern;

/**
 * @author Admin
 * object combination achieve adapters
 */
public class Adapter1 implements Target {
	
	private Adaptee adaptee;
	
	public Adapter1() {
		super();
	}

	public Adapter1(Adaptee adaptee) {
		this();
		this.adaptee = adaptee;
	}

	@Override
	public void handleRequest() {
		adaptee.dealRequest();
	}

}
