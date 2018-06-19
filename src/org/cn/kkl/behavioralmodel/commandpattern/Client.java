package org.cn.kkl.behavioralmodel.commandpattern;

public class Client {
	
	public static void main(String[] args) {
		Client client =new Client();
		client.test();
	}

	private void test() {
		Command c=new ConcreteCommand(new Receiver());
		
		Invoke invoke = new Invoke(c);
		
		invoke.call();
	}

}
