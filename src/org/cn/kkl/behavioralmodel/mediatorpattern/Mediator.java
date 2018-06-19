package org.cn.kkl.behavioralmodel.mediatorpattern;

public interface Mediator {
	
	void register(String dname,Department d);
	
	void command(String dname);
	
	

}
