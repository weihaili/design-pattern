package org.cn.kkl.createdmodel.creatormodel;

public class Engine {
	
	private String name;
	
	public Engine() {
		super();
	}
	
	public Engine(String name) {
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private void start(){
		System.out.println("engine is start");
	}
	
	private void stop(){
		System.out.println("engine is stop");
	}
	
}
