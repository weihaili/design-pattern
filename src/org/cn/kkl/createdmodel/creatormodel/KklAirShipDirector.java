package org.cn.kkl.createdmodel.creatormodel;

public class KklAirShipDirector implements AirShipDirector {
	
	private AirShipBuilder airShipBuiler;

	public KklAirShipDirector(AirShipBuilder airShipBuiler) {
		super();
		this.airShipBuiler = airShipBuiler;
	}

	@Override
	public AirShip assembleAirShip() {
		Engine engine = airShipBuiler.buildEngine();
		OrbitalModule orbitalModule=airShipBuiler.buildOrbitalModule();
		EscapeTower escapeTower = airShipBuiler.buildEscapeTower();
		
		AirShip airShip=new AirShip();
		airShip.setEngine(engine);
		airShip.setEscapeTower(escapeTower);
		airShip.setOrbitalModule(orbitalModule);
		
		return airShip;
	}

}
