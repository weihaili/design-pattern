package org.cn.kkl.createdmodel.factorymodel.factorymethodpattern;

public class Test {

	public static void main(String[] args) {
		Test t=new Test();
		t.test01();
	}

	/**
	 * test
	 */
	private void test01() {
		AudiFactory audiFactory=new AudiFactory();
		Car car = audiFactory.createCar();
		car.run();
		
		BenzFactory bf=new BenzFactory();
		Car benz=bf.createCar();
		benz.run();
		
		Car lmb=new LmbFactory().createCar();
		lmb.run();
		
		
	}

}
