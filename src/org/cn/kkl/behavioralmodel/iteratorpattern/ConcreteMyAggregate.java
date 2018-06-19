package org.cn.kkl.behavioralmodel.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMyAggregate {
	
	private List<Object> list=new ArrayList<Object>();

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	
	public void setObject(Object obj){
		this.list.add(obj);
	}
	
	public void removeObject(Object obj){
		if (list.contains(obj)) {
			this.list.remove(obj);
		}
	}
	
	public Object getObject(int index){
		if(index<0 || index>this.list.size()){
			System.out.println("cross-border");
			return null;
		}else{
			return list.get(index);
		}
	}
	
	public ConcreteIterator concreteIterator() {
		return new ConcreteIterator();
	}
	
	private class ConcreteIterator implements MyIterator{
		
		private int cursor;

		@Override
		public void first() {
			cursor=0;
			
		}

		@Override
		public void next() {
			if(cursor<list.size()){
				cursor++;
			}
		}

		@Override
		public boolean hasNext() {
			if(cursor<list.size()){
				return true;
			}
			return false;
		}

		@Override
		public boolean isFirst() {
			return cursor==0;
		}

		@Override
		public boolean isLast() {
			return cursor==(list.size()-1);
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}
		
	}
	

}
