package org.cn.kkl.createdmodel.factorymodel.simplepattern;

/**
 * @author Admin
 *  factory
 */
public class CarFactory {
	
	public static Car createCar(String type){
		Car car = null;
		if(type==null || type.isEmpty()){
			car=null;
		}else if("audi".equalsIgnoreCase(type)){
			car=new Audi();
		}else if("bmw".equalsIgnoreCase(type)){
			car = new Bmw();
		}else if("fli".equalsIgnoreCase(type)){
			car=new Fli();
		}
		return car;
	}
	
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
