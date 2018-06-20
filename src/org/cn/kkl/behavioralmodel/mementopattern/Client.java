package org.cn.kkl.behavioralmodel.mementopattern;

import java.security.spec.ECGenParameterSpec;

public class Client {
	
	public static void main(String[] args) {
		Client client=new Client();
		//client.test01();
		
		//client.test02();
		
		client.test03();
	}

	private void test03() {
		CareTakerList takerList = new CareTakerList();
		
		Emp emp=new Emp("TLAP", 1234, 67);
		System.out.println("create emp "+ emp.getName()+"******"+emp.getSalary()+"********"+emp.getAge()+"**********");
		
		takerList.setEmpMemento(emp.memoOperate());
		emp.setName("TLUOP");
		takerList.setEmpMemento(emp.memoOperate());
		emp.setAge(80);
		takerList.setEmpMemento(emp.memoOperate());
		emp.setSalary(324);
		takerList.setEmpMemento(emp.memoOperate());
		emp.setName("Tuoluop");
		takerList.setEmpMemento(emp.memoOperate());
		
		emp.recovery(takerList.getEmpMemento());
		System.out.println("create emp "+ emp.getName()+"******"+emp.getSalary()+"********"+emp.getAge()+"**********");
		emp.recovery(takerList.getEmpMemento());
		System.out.println("create emp "+ emp.getName()+"******"+emp.getSalary()+"********"+emp.getAge()+"**********");
		emp.recovery(takerList.getEmpMemento());
		System.out.println("create emp "+ emp.getName()+"******"+emp.getSalary()+"********"+emp.getAge()+"**********");
		emp.recovery(takerList.getEmpMemento());
		System.out.println("create emp "+ emp.getName()+"******"+emp.getSalary()+"********"+emp.getAge()+"**********");
		emp.recovery(takerList.getEmpMemento());
		System.out.println("create emp "+ emp.getName()+"******"+emp.getSalary()+"********"+emp.getAge()+"**********");
		
	}

	private void test02() {
		CareTakerMultipart takerMultipart = new CareTakerMultipart();
		
		Emp emp=new Emp("TLAP", 1234, 67);
		System.out.println("create emp "+ emp.getName()+"******"+emp.getSalary()+"********"+emp.getAge()+"**********");
		
		takerMultipart.setMemento(emp.memoOperate());
		emp.setName("TLUOP");
		takerMultipart.setMemento(emp.memoOperate());
		emp.setAge(80);
		takerMultipart.setMemento(emp.memoOperate());
		emp.setSalary(324);
		takerMultipart.setMemento(emp.memoOperate());
		emp.setName("Tuoluop");
		takerMultipart.setMemento(emp.memoOperate());
		
		emp.recovery(takerMultipart.getMemento());
		System.out.println("create emp "+ emp.getName()+"******"+emp.getSalary()+"********"+emp.getAge()+"**********");
		emp.recovery(takerMultipart.getMemento());
		System.out.println("create emp "+ emp.getName()+"******"+emp.getSalary()+"********"+emp.getAge()+"**********");
		emp.recovery(takerMultipart.getMemento());
		System.out.println("create emp "+ emp.getName()+"******"+emp.getSalary()+"********"+emp.getAge()+"**********");
		emp.recovery(takerMultipart.getMemento());
		System.out.println("create emp "+ emp.getName()+"******"+emp.getSalary()+"********"+emp.getAge()+"**********");
		emp.recovery(takerMultipart.getMemento());
		System.out.println("create emp "+ emp.getName()+"******"+emp.getSalary()+"********"+emp.getAge()+"**********");
		
	}

	private void test01() {
		CareTaker taker=new CareTaker();
		
		Emp emp=new Emp("TLP", 2000.0, 67);
		System.out.println("create emp "+emp.getName()+emp.getSalary()+emp.getAge());
		
		//set memo point
		taker.setMemento(emp.memoOperate());
		
		emp.setAge(69);
		emp.setName("talapou");
		emp.setSalary(1500.0);
		System.out.println("update emp"+emp.getName()+emp.getSalary()+emp.getAge());
		
		//recovery taker current manager state
		emp.recovery(taker.getMemento());
		System.out.println("recovery emp "+emp.getName()+emp.getSalary()+emp.getAge());
		
		
	}

}
