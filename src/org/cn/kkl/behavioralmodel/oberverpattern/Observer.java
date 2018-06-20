package org.cn.kkl.behavioralmodel.oberverpattern;

public interface Observer {

	void update(Subject subject);

}

class clientA implements Observer {

	private String name;

	public clientA(String name) {
		super();
		this.name = name;
	}

	private String myState;

	@Override
	public void update(Subject subject) {
		myState = subject.getState();
		System.out.println(myState);
	}

}

class clientB implements Observer {

	private String name;

	public clientB(String name) {
		super();
		this.name = name;
	}

	private String myState;

	@Override
	public void update(Subject subject) {
		myState = subject.getState();
		System.out.println(myState);
	}

}
