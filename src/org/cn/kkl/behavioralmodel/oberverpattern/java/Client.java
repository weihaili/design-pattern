package org.cn.kkl.behavioralmodel.oberverpattern.java;

public class Client {
	public static void main(String[] args) {
		Client client = new Client();
		client.test01();
	}

	private void test01() {
		ConcreteSubject subject = new ConcreteSubject();
		ObserverA a = new ObserverA();
		ObserverA b = new ObserverA();
		ObserverA c=new ObserverA();
		
		subject.addObserver(a);
		subject.addObserver(b);
		subject.addObserver(c);
		
		subject.setState(100);
	}
}
