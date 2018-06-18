package org.cn.kkl.structuralmodel.proxypattern.dynamicproxymode;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		Client client=new Client();
		client.test01();
	}

	/**
	 * test dynamic proxy
	 */
	private void test01() {
		Star mike=new RealStar();
		StarHandler handler = new StarHandler();
		handler.setRealStar(mike);
		StarHandler handler1= new StarHandler(mike);
		
		Star pStar=(Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler1);
		pStar.bookTicket();
		pStar.sing();
		pStar.receivedFinalPayment();
		
		
	}

}
