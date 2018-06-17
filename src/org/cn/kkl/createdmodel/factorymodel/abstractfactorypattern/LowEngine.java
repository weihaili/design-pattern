package org.cn.kkl.createdmodel.factorymodel.abstractfactorypattern;

public class LowEngine implements Engine {

	@Override
	public void start() {
		System.out.println("low engine start");
	}

	@Override
	public void run() {
		System.out.println("low engine run");
	}

}
