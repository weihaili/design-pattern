package org.cn.kkl.behavioralmodel.templatemethodpattern;

public class Client {
	
	public static void main(String[] args) {
		Client client = new Client();
		client.test01();
	}

	private void test01() {
		BankTemplateMethod wm=new WithDrawMoney();
		wm.process();
		
		new FinancialManagement().process();
		
		new Doposit().process();
		
	}

}
