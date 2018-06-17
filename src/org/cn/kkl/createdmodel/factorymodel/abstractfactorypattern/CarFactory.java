package org.cn.kkl.createdmodel.factorymodel.abstractfactorypattern;

public interface CarFactory {
	
	Engine createEngine();
	
	Seat createSeat();
	
	Tyre createTyre();

}
