package org.cn.kkl.behavioralmodel.iteratorpattern;

public class Client {

	public static void main(String[] args) {
		Client client=new Client();
		client.test01();
	}

	private void test01() {
		
		ConcreteMyAggregate cma=new ConcreteMyAggregate();
		cma.setObject("aa");
		cma.setObject("bb");
		cma.setObject(123);
		cma.setObject(49.14);
		
		MyIterator mit=cma.concreteIterator();
		while (mit.hasNext()) {
			System.out.println(mit.getCurrentObj());
			mit.next();
			
		}
		
	}

}
