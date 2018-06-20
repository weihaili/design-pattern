package org.cn.kkl.behavioralmodel.templatemethodpattern;

public class FinancialManagement extends BankTemplateMethod {

	@Override
	public void transact() {
		System.out.println("I want financial management I have 2929929292929$ idle");
	}

	@Override
	public void evaluate() {
		System.out.println("financial management should be first");
	}

}
