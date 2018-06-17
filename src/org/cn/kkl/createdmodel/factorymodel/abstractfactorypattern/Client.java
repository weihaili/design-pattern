package org.cn.kkl.createdmodel.factorymodel.abstractfactorypattern;

public class Client {

	public static void main(String[] args) {
		Client t=new Client();
		t.test01();
		
	}

	/**
	 * test
	 */
	private void test01() {
		new LowCarFactory().createEngine().run();
		new LowCarFactory().createSeat().massage();
		new LowCarFactory().createTyre().revolve();
	}

}
