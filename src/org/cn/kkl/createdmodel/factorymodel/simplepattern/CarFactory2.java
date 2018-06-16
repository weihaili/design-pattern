package org.cn.kkl.createdmodel.factorymodel.simplepattern;

public class CarFactory2 {
	
	public static Car createAudi(){
		return new Audi();
	}
	
	public static Car createFli(){
		return new Fli();
	}
	
	public static Car createBmw(){
		return new Bmw();
	}

}
