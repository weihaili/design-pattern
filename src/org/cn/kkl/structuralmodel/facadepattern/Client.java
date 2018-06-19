package org.cn.kkl.structuralmodel.facadepattern;

public class Client {

	public static void main(String[] args) {
		Client client = new Client();
		client.test01();
	}

	private void test01() {
		Register register = new Register();
		register.registe();
	}

}
