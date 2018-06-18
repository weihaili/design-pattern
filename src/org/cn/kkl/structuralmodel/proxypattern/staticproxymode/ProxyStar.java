package org.cn.kkl.structuralmodel.proxypattern.staticproxymode;

public class ProxyStar implements Star {
	
	private Star star;
	
	public ProxyStar() {
		super();
	}

	public ProxyStar(Star star) {
		this();
		this.star = star;
	}

	@Override
	public void confer() {
		System.out.println("ProxyStar confer()");
	}

	@Override
	public void signContract() {
		System.out.println("ProxyStar signContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar bookTicket()");
	}

	@Override
	public void sing() {
		star.sing();
	}

	@Override
	public void receivedFinalPayment() {
		System.out.println("ProxyStar receivedFinalPayment()");

	}

}
