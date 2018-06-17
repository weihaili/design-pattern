package org.cn.kkl.createdmodel.factorymodel.abstractfactorypattern;

public class LuxuryEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Luxury engine start");
	}

	@Override
	public void run() {
		System.out.println("Luxury engine run");

	}

}
