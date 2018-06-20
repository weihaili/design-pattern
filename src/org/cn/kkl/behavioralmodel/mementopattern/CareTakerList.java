package org.cn.kkl.behavioralmodel.mementopattern;

import java.util.ArrayList;
import java.util.List;

public class CareTakerList {
	
	private EmpMemento empMemento;
	
	private int flag;
	
	private List<EmpMemento> list = new ArrayList<EmpMemento>();

	public EmpMemento getEmpMemento() {
		EmpMemento temp=list.get(flag);
		flag++;
		return temp;
	}

	public void setEmpMemento(EmpMemento empMemento) {
		this.empMemento = empMemento;
		list.add(empMemento);
	}

}
