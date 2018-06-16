package org.cn.kkl.createdmodel.factorymodel.simplepattern.test;

import org.cn.kkl.createdmodel.factorymodel.simplepattern.Audi;
import org.cn.kkl.createdmodel.factorymodel.simplepattern.Bmw;
import org.cn.kkl.createdmodel.factorymodel.simplepattern.Car;
import org.cn.kkl.createdmodel.factorymodel.simplepattern.Fli;

/**
 * @author Admin
 * there is not factory situation ,create object
 *
 */
public class Test {

	public static void main(String[] args) {
		Test t=new Test();
		t.test01();
	}
	
	private void test01(){
		Car audi=new Audi();
		Car bmw=new Bmw();
		Car fli=new Fli();
		audi.run();
		bmw.run();
		fli.run();
	}

}
