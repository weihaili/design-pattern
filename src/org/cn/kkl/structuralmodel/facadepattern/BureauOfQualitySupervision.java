package org.cn.kkl.structuralmodel.facadepattern;

public interface BureauOfQualitySupervision {
	void handleOrganizationCodeCertificate();
}

class LocalBureauOfQualitySupervision implements BureauOfQualitySupervision{

	@Override
	public void handleOrganizationCodeCertificate() {
		System.out.println("my company organization code is 8989898");
	}
	
}
