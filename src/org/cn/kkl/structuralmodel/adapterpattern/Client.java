package org.cn.kkl.structuralmodel.adapterpattern;

public class Client {
	
	public static void main(String[] args) {
		Client c = new Client();
		c.test01();
		c.test02();
	}
	
	private void test01(){
		Target t= new Adapter();
		test(t);
		
	}
	
	private void test02(){
		Adaptee adaptee=new Adaptee();
		Target t = new Adapter1(adaptee);
		test(t);
	}

	private void test(Target t) {
		t.handleRequest();
	}

}
