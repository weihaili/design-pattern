package org.cn.kkl.structuralmodel.flyweightpattern;

public class Client {
	public static void main(String[] args) {
		Client client=new Client();
		client.test01();
	}

	private void test01() {
		ChessFlyWeight c1=ChessFlyWeightFactory.getChess("black");
		ChessFlyWeight c2=ChessFlyWeightFactory.getChess("white");
		System.out.println(c1);
		System.out.println(c2);
		
		c1.display(new Coordinate(10, 10));
		c2.display(new Coordinate(20, 30));
	}
}
