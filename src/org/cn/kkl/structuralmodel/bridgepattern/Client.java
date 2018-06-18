package org.cn.kkl.structuralmodel.bridgepattern;

public class Client {

	public static void main(String[] args) {
		Client client = new Client();
		client.test01();
	}

	private void test01() {
		Computer2 computer2 = new Laptop2(new Lenovo());
		computer2.sale();
		
		Computer2 mmr = new Desktop2(new Mmr());
		mmr.sale();
	}

}
