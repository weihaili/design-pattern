package org.cn.kkl.structuralmodel.facadepattern;

public interface Bank {
	void OpenCount();
}

class LocalBank implements Bank{

	@Override
	public void OpenCount() {
		System.out.println("my company account is 888898989");
	}
	
}
