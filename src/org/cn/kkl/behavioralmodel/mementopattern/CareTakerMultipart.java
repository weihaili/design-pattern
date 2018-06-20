package org.cn.kkl.behavioralmodel.mementopattern;

import java.util.Stack;

public class CareTakerMultipart {
	
	private EmpMemento memento;
	
	private Stack<EmpMemento> stack = new Stack<EmpMemento>();

	public EmpMemento getMemento() {
		this.memento=stack.lastElement();
		stack.remove(memento);
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
		stack.add(memento);
	}
	
	

}
