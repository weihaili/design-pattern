package org.cn.kkl.behavioralmodel.oberverpattern.java;

import java.util.Observable;

public class ConcreteSubject extends Observable {
	
	private int state ;
	
	public void setState(int state){
		this.state=state;
		System.out.println("ConcreteSubject state is "+ state);
		
		setChanged();
		
		notifyObservers(state);
	}

	public int getState() {
		return state;
	}
	

}
