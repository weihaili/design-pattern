package org.cn.kkl.behavioralmodel.statepattern;

public class Client {
	
	public static void main(String[] args) {
		Client client=new Client();
		client.test01();
	}

	private void test01() {
		Context context = new Context();
		context.setState(new IdleState());
	}

}
