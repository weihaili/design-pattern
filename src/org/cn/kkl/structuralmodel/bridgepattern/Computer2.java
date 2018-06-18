package org.cn.kkl.structuralmodel.bridgepattern;

public abstract class Computer2 {
	
	protected Brand brand;

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Computer2() {
		super();
	}

	public Computer2(Brand brand) {
		this();
		this.brand = brand;
	}
	
	public void sale(){
		brand.sale();
	}
	
}

class Desktop2 extends Computer2{

	public Desktop2(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("sale desktop ");
	}
}

class Laptop2 extends Computer2{

	public Laptop2(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("sale Laptop ");
	}
}

class Pad2 extends Computer2{

	public Pad2(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("sale Pad ");
	}
}

