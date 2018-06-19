package org.cn.kkl.structuralmodel.facadepattern.regular;

public interface IndustryAndCommerceBureau {
	void checkName();
}

class LocalIndustryAndCommerceBureau implements IndustryAndCommerceBureau{

	@Override
	public void checkName() {
		System.out.println("local industryAndCommerceBureau check company name is it redundant");
	}
	
}
