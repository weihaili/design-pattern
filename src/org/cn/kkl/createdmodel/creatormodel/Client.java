package org.cn.kkl.createdmodel.creatormodel;

public class Client {
	
	public static void main(String[] args) {
		Client t=new Client();
		t.test01();
	}

	/**
	 *test 
	 */
	private void test01() {
		AirShipDirector airShipDirector = new KklAirShipDirector(new KklAirShipBuilder());
		AirShip airShip = airShipDirector.assembleAirShip();
		airShip.fly();
		airShip.launch();
	}

}
