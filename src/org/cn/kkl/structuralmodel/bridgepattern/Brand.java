package org.cn.kkl.structuralmodel.bridgepattern;

public interface Brand {
	void sale();
}

class Lenovo implements Brand{
	@Override
	public void sale() {
		System.out.println("sale lenovo");
	}
}

class Mmr implements Brand{
	@Override
	public void sale() {
		System.out.println("sale Mmr");
	}
}

class Wxr implements Brand{
	@Override
	public void sale() {
		System.out.println("sale Wxr");
	}
}


