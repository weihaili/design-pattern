package org.cn.kkl.structuralmodel.proxypattern.dynamicproxymode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
	
	private Star realStar;

	public void setRealStar(Star realStar) {
		this.realStar = realStar;
	}

	public StarHandler() {
		super();
	}

	public StarHandler(Star realStar) {
		this();
		this.realStar = realStar;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object obj=null;
		if(method.getName().equalsIgnoreCase("sing")){
			obj=method.invoke(realStar, args);
		}else{
			System.out.println("proxy deal with other things");
		}
		return obj;
	}

}
