package org.cn.kkl.behavioralmodel.mediatorpattern;

public class Development implements Department {
	
	private Mediator mediator; 

	public Development(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("development", this);
	}

	@Override
	public void selfAction() {
		System.out.println("develop program");
	}

	@Override
	public void outAction() {
		System.out.println("report work");
	}

}
