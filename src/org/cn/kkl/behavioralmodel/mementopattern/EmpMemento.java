package org.cn.kkl.behavioralmodel.mementopattern;

/**
 * @author Admin express memorandum(memento) class
 */
public class EmpMemento {
	private String name;

	private double salary;

	private int age;
	
	public EmpMemento(Emp e) {
		this.name=e.getName();
		this.salary=e.getSalary();
		this.age=e.getAge();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
