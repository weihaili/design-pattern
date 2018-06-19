package org.cn.kkl.behavioralmodel.mediatorpattern;

public class Finacial implements Department {
	
	private Mediator mediator;

	public Finacial(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("finacial", this);
	}

	@Override
	public void selfAction() {
		System.out.println("count money");
	}

	@Override
	public void outAction() {
		System.out.println("finacial report work");
	}

}
