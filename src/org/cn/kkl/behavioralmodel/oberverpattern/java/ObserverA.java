package org.cn.kkl.behavioralmodel.oberverpattern.java;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {
	
	private int myState;

	@Override
	public void update(Observable o, Object arg) {
		
		myState=((ConcreteSubject)o).getState();
		
		System.out.println("ObserverA state is"+myState);

	}

}
