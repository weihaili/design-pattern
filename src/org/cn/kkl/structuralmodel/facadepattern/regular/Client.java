package org.cn.kkl.structuralmodel.facadepattern.regular;

public class Client {
	
	public static void main(String[] args) {
		Client client = new Client();
		client.test01();
	}

	private void test01() {
		IndustryAndCommerceBureau iacb=new LocalIndustryAndCommerceBureau();
		iacb.checkName();
		
		BureauOfQualitySupervision boqs = new LocalBureauOfQualitySupervision();
		boqs.handleOrganizationCodeCertificate();
		
		TaxBureau tb=new LocalTaxBureau();
		tb.taxCertificate();
		
		Bank bank=new LocalBank();
		bank.OpenCount();
		
		
	}

}
