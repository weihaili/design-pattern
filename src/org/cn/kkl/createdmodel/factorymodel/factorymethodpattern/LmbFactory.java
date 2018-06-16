package org.cn.kkl.createdmodel.factorymodel.factorymethodpattern;

public class LmbFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Lmb();
	}

}
