package org.cn.kkl.behavioralmodel.mediatorpattern;

public class Client {
	
	public static void main(String[] args) {
		Client client = new Client();
		client.test01();
	}

	private void test01() {
		Mediator m=new President();
		Department market = new Market(m);
		Department development = new Development(m);
		Department finacial = new Finacial(m);
		
		market.selfAction();
		development.selfAction();
		finacial.selfAction();
		
		market.outAction();
		
	}

}
