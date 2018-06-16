package org.cn.kkl.createdmodel.factorymodel.factorymethodpattern;

public class AudiFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Audi();
	}

}
