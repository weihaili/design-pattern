package org.cn.kkl.behavioralmodel.oberverpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	protected String subjectName;
	
	public Subject(String subjectName) {
		this.subjectName=subjectName;
	}
	
	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		this.noticeAllObserver();
	}
	
	protected List<Observer> list =new ArrayList<Observer>();
	
	public abstract void noticeAllObserver();
	
	public void register(Observer observer){
		list.add(observer);
	}
	
	public void remove(Observer observer){
		list.remove(observer);
	}

}

class ConcreteSubjectA extends Subject{
	
	
	public ConcreteSubjectA(String subjectName) {
		super(subjectName);
	}

	public  void noticeAllObserver(){
		for (Observer observer : list) {
			observer.update(this);
		}
	}
}

class ConcreteSubjectB extends Subject{
	
	public ConcreteSubjectB(String subjectName) {
		super(subjectName);
	}

	@Override
	public void noticeAllObserver() {
		for (Observer observer : list) {
			observer.update(this);
		}
	}
	
}
