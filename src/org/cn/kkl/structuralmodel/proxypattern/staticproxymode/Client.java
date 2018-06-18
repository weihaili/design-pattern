package org.cn.kkl.structuralmodel.proxypattern.staticproxymode;

public class Client {
	
	public static void main(String[] args) {
		Client c=new Client();
		c.inviteMikeHoldConcert();
	}

	/**
	 * test
	 */
	private void inviteMikeHoldConcert() {
		Star mike=new RealStar();
		Star pStar=new ProxyStar(mike);
		pStar.bookTicket();
		pStar.sing();
		pStar.receivedFinalPayment();
	}

}
