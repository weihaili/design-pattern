package org.cn.kkl.behavioralmodel.mementopattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Admin
 * care taker class
 * 
 * responsible for managing memo objects 
 */
public class CareTaker {
	
	private EmpMemento memento;
	
	//private List<EmpMemento> list=new ArrayList<EmpMemento>();
	
	//private Stack<EmpMemento> stack = new Stack<EmpMemento>();

	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}

}
