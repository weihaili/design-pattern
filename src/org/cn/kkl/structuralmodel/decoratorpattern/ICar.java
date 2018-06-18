package org.cn.kkl.structuralmodel.decoratorpattern;

/**
 * @author Admin
 * component
 */
public interface ICar {
	void move();
}

/**
 * @author Admin
 * conCreatecomponent
 *
 */
class Car implements ICar{
	@Override
	public void move() {
		System.out.println("普通汽车");
	}
}

class SuperCar implements ICar{
	private ICar icar;
	
	public SuperCar(ICar icar) {
		super();
		this.icar = icar;
	}

	@Override
	public void move() {
		icar.move();
	}
}

/**
 * @author Admin
 * concreteDecorator
 *
 */
class FlyCar extends SuperCar{
	
	public FlyCar(ICar icar) {
		super(icar);
	}
	
	public void fly(){
		System.out.println("fly in sky");
	}

	@Override
	public void move() {
		super.move();
		fly();
	}
}

/**
 * @author Admin
 * concreteDecorator
 *
 */
class WaterCar extends SuperCar{
	
	public WaterCar(ICar icar) {
		super(icar);
	}
	
	public void diving(){
		System.out.println("diving in sea");
	}

	@Override
	public void move() {
		super.move();
		diving();
	}
}

/**
 * @author Admin
 * concreteDecorator
 */
class AICar extends SuperCar{
	
	public AICar(ICar icar) {
		super(icar);
	}
	
	public void unmanned(){
		System.out.println("unmanned diriving ");
	}

	@Override
	public void move() {
		super.move();
		unmanned();
	}
}

