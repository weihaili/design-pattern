package org.cn.kkl.behavioralmodel.statepattern;

public interface State {
	
	void handle();

}

class IdleState implements State{

	@Override
	public void handle() {
		System.out.println("room is idle");
		
	}
	
}

class BookedState implements State{

	@Override
	public void handle() {
		System.out.println("room is booked waiting for customer check in");
		
	}
	
}

class HaveStayedState implements State{

	@Override
	public void handle() {
		System.out.println("there is customer in room please provide the best service");
		
	}
	
}
