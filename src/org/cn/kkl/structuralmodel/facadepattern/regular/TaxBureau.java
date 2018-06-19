package org.cn.kkl.structuralmodel.facadepattern.regular;

public interface TaxBureau {
	void taxCertificate();
}

class LocalTaxBureau implements TaxBureau{

	@Override
	public void taxCertificate() {
		System.out.println("local tax bureau register tax number and certificate");
		
	}
	
}