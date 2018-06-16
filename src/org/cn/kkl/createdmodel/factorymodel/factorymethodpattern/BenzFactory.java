package org.cn.kkl.createdmodel.factorymodel.factorymethodpattern;

public class BenzFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Benz();
	}

}
