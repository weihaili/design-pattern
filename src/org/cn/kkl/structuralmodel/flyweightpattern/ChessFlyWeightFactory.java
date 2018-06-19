package org.cn.kkl.structuralmodel.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

public class ChessFlyWeightFactory {
	//flyWeight pool object
	private static Map<String,ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();
	
	public static ChessFlyWeight getChess(String color){
		if(map.get(color)!=null){
			return map.get(color);
		}else{
			ChessFlyWeight cfw=new ConcreteChess(color);
			map.put(color, cfw);
			return cfw;
		}
	}

}
