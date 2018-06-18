package org.cn.kkl.structuralmodel.bridgepattern;

public interface Computer {
	
	void sale();
}

class Desktop implements Computer{
	@Override
	public void sale() {
		System.out.println("sale desktop ");
	}
}

class LenovoDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("sale lenoveDesktop");
	}
}
class ShenZhouDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("sale ShenZhouDesktop");
	}
}
class MmrDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("sale MmrDesktop");
	}
}

class Laptop implements Computer{

	@Override
	public void sale() {
		System.out.println("sale laptop");
	}
	
}
class LenovoLaptop extends Laptop{
	@Override
	public void sale() {
		System.out.println("sale lenoveLaptop");
	}
}
class ShenZhouLaptop extends Laptop{
	@Override
	public void sale() {
		System.out.println("sale ShenZhouLaptop");
	}
}
class MmrLaptop extends Laptop{
	@Override
	public void sale() {
		System.out.println("sale MmrLaptop");
	}
}

class Pad implements Computer{

	@Override
	public void sale() {
		System.out.println("sale pad");
	}
	
}

class LenovoPad extends Pad{
	@Override
	public void sale() {
		System.out.println("sale lenovePad");
	}
}
class ShenZhouPad extends Pad{
	@Override
	public void sale() {
		System.out.println("sale ShenZhouPad");
	}
}
class MmrPad extends Pad{
	@Override
	public void sale() {
		System.out.println("sale MmrPad");
	}
}
