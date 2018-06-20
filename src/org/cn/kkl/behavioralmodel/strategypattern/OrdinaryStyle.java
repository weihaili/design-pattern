package org.cn.kkl.behavioralmodel.strategypattern;

/**
 * @author Admin
 * ordinary style meets the ordinary logic,if meet update ,do not compliance COP ,have to update this class code 
 */
public class OrdinaryStyle {
	
	public double getPrice(String type,double price) {
		double factor=1.0;
		if("ordinarySmallCustomers".equalsIgnoreCase(type)){
			factor+=0.1;
		}else if("ordinaryCustomer".equalsIgnoreCase(type)){
			factor=0.9;
		}else if("frequentSmallCustomer".equalsIgnoreCase(type)){
			factor=0.85;
		}else if("frequentCustomer".equalsIgnoreCase(type)){
			factor=0.8;
		}
		return price*factor;
	}

}
