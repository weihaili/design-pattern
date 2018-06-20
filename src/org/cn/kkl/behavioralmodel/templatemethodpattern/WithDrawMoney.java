package org.cn.kkl.behavioralmodel.templatemethodpattern;

public class WithDrawMoney extends BankTemplateMethod {

	@Override
	public void transact() {
		System.out.println("with draw money 10000000000$");
	}

	@Override
	public void evaluate() {
		System.out.println("with money should be first");
	}

}
