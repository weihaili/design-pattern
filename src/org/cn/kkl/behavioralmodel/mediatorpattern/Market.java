package org.cn.kkl.behavioralmodel.mediatorpattern;

public class Market implements Department {
	
	private Mediator mediator;
	
	public Market(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("research market conditions");
	}

	@Override
	public void outAction() {
		System.out.println("market report work");
		
		mediator.command("finacial");
	}

}
