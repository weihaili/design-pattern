package org.cn.kkl.structuralmodel.facadepattern;

import org.cn.kkl.structuralmodel.facadepattern.Bank;
import org.cn.kkl.structuralmodel.facadepattern.BureauOfQualitySupervision;
import org.cn.kkl.structuralmodel.facadepattern.IndustryAndCommerceBureau;
import org.cn.kkl.structuralmodel.facadepattern.TaxBureau;

public class Register {
	
	public void registe(){
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
