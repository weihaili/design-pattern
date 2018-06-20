package org.cn.kkl.behavioralmodel.strategypattern;

/**
 * @author Admin
 *this class responsible for interacting with strategy class
 *implements the separation of the algorithm from the caller
 */
public class Context {
	
	private Strategy strategy;

	public Context() {
		super();
	}

	public Context(Strategy strategy) {
		this();
		this.strategy = strategy;
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public double reportPrice(double originalPrice){
		System.out.println("system report price is  "+strategy.getPrice(originalPrice));
		return strategy.getPrice(originalPrice);
	}
	
	

}
