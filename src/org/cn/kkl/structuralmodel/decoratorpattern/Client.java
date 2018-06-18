package org.cn.kkl.structuralmodel.decoratorpattern;

public class Client {

	public static void main(String[] args) {
		Client client = new Client();
		//client.test01();
		
		//client.test02();
		
		client.test03();
	}

	private void test03() {
		Car car = new Car();
		FlyCar flyCar = new FlyCar(car);
		AICar aiCar = new AICar(flyCar);
		aiCar.move();
	}

	private void test02() {
		FlyCar flyCar = new FlyCar(new Car());
		flyCar.move();
	}

	/**
	 * test decorator pattern
	 */
	private void test01() {
		Car car = new Car();
		car.move();
	}

}
