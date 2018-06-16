package org.cn.kkl.createdmodel.factorymodel.simplepattern.test;

import org.cn.kkl.createdmodel.factorymodel.simplepattern.Car;
import org.cn.kkl.createdmodel.factorymodel.simplepattern.CarFactory;

public class FactoryTest {

	public static void main(String[] args) {
		FactoryTest ft=new FactoryTest();
		ft.test01();

	}

	/**
	 * factory test 
	 */
	private void test01() {
		Car audi=CarFactory.createCar("audi");
		Car bmw = CarFactory.createCar("bmw");
		Car fli=CarFactory.createCar("fli");
		audi.run();
		bmw.run();
		fli.run();
	}

}
