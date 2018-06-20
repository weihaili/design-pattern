package org.cn.kkl.behavioralmodel.oberverpattern;

public class Client {
	public static void main(String[] args) {
		Client client=new Client();
		client.test01();
	}

	private void test01() {
		
		Subject a = new ConcreteSubjectA("flying god cow");
		clientA clientA=new clientA("ao ba ma");
		clientB clientB = new clientB("C lou");
		
		a.register(clientA);
		a.register(clientB);
		
		a.remove(clientB);
		
		a.setState("jump");
		
	}
}
