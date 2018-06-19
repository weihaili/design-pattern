package org.cn.kkl.behavioralmodel.iteratorpattern;

public interface MyIterator {
	
	void first();
	void next();
	boolean hasNext();
	
	boolean isFirst();
	boolean isLast();
	
	Object getCurrentObj();

}
