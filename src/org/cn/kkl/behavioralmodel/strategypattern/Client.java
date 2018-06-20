package org.cn.kkl.behavioralmodel.strategypattern;

public class Client {
	
	public static void main(String[] args) {
		Client client = new Client();
		client.test01();
	}

	private void test01() {
		Context context=new Context(new OrdinaryCustomerSmallBatch());
		double ordinaryCustomerSmallBatchPrice=context.reportPrice(1000.0);
		System.out.println(ordinaryCustomerSmallBatchPrice);
		
		context.setStrategy(new FrequentGuest());
		double frequentGurestPrice=context.reportPrice(1000);
		System.out.println(frequentGurestPrice);
		
		context.setStrategy(new FrequentGuestBigBatch());
		System.out.println(context.reportPrice(1000));
	}

}
