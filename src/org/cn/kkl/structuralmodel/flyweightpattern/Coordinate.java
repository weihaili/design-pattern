package org.cn.kkl.structuralmodel.flyweightpattern;

/**
 * @author Admin
 * unsharedConcreteFlyWeight
 */
public class Coordinate {
	private int x,y;

	public Coordinate() {
		super();
	}

	public Coordinate(int x, int y) {
		this();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
