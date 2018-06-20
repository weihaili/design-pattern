package org.cn.kkl.behavioralmodel.templatemethodpattern;

public class Doposit extends BankTemplateMethod {

	@Override
	public void transact() {
		System.out.println("save money 10000000000000$");
	}

	@Override
	public void evaluate() {
		System.out.println("I think save money should be first");
	}

	
}
