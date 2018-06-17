package org.cn.kkl.createdmodel.creatormodel;

public class AirShip {
	
	private OrbitalModule orbitalModule;
	
	private Engine engine;
	
	private EscapeTower escapeTower;

	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}

	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public EscapeTower getEscapeTower() {
		return escapeTower;
	}

	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
	
	public void fly(){
		System.out.println("air ship is flying");
	}
	
	public void launch(){
		System.out.println("launch kkl airship of brand success");
	}

}
