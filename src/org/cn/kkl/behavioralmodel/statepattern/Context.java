package org.cn.kkl.behavioralmodel.statepattern;

/**
 * @author Admin
 * express the current states of the current room
 */
public class Context {
	
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		System.out.println("update that room state");
		this.state = state;
		state.handle();
	}
	

}
