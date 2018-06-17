package org.cn.kkl.createdmodel.creatormodel;

public class KklAirShipBuilder implements AirShipBuilder {

	@Override
	public Engine buildEngine() {
		System.out.println("bulid kkl engine of brand ");
		return new Engine("kkl");
	}

	@Override
	public OrbitalModule buildOrbitalModule() {
		System.out.println("bulid kkl orbital module of brand ");
		return new OrbitalModule("kkl");
	}

	@Override
	public EscapeTower buildEscapeTower() {
		System.out.println("bulid kkl escape tower of brand ");
		return new EscapeTower("kkl");
	}

}
