package org.cn.kkl.structuralmodel.flyweightpattern;

public interface ChessFlyWeight {
	
	void setColor(String color);
	String getColor();
	void display(Coordinate coordinate);
	

}

class ConcreteChess implements ChessFlyWeight{
	
	private String color;

	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String color) {
		this.color=color;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate coordinate) {
		System.out.println("chess color "+color);
		System.out.println("chess position :x="+coordinate.getX()+", y= "+coordinate.getY() );
	}
	
}
