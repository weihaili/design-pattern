package org.cn.kkl.behavioralmodel.strategypattern;

public class OrdinaryCustomerSmallBatch implements Strategy {

	@Override
	public double getPrice(double originalPrice) {
		System.out.println("this client is new customer do not discount");
		return originalPrice;
	}
}

class OrdinaryCustomerBigBatch implements Strategy{
	@Override
	public double getPrice(double originalPrice) {
		System.out.println("this client is new customer but buy a large number goods discount 0.9");
		return originalPrice*0.9;
	}
}

class FrequentGuest implements Strategy{
	@Override
	public double getPrice(double originalPrice) {
		System.out.println("this is frequent guest ,they care about our company so discount 0.85");
		return originalPrice*0.85;
	}
}

class FrequentGuestBigBatch implements Strategy{
	@Override
	public double getPrice(double originalPrice) {
		System.out.println("this is frequent guest ,they buy a large number goog every times,so they are VIP discount 0.8");
		return originalPrice*0.8;
	}
}