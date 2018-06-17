package org.cn.kkl.createdmodel.creatormodel;

public class EscapeTower {
	
	private String name;

	public EscapeTower() {
		super();
	}

	public EscapeTower(String name) {
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
		System.out.println("escape tower is start");
	}
	
	private void stop(){
		System.out.println("escape tower is stop");
	}
	
	private boolean isBreak(int num){
		if(0==num){
			return true;
		}else{
			return false;
		}
	}
	
}
