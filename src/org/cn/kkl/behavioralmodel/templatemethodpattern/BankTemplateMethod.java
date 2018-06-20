package org.cn.kkl.behavioralmodel.templatemethodpattern;

public abstract class BankTemplateMethod {
	
	private int num=0;
	
	public void takeNumber() {
		System.out.println("take number"+(num++)+" and queued");
	}
	
	public abstract void transact();
	
	public void evaluate(){
		System.out.println("feedback rating");
	}
	
	
	/**
	 * template method 
	 */
	public final void process(){
		this.takeNumber();
		
		this.transact();
		
		this.evaluate();
	}

}
