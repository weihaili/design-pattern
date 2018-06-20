package org.cn.kkl.behavioralmodel.mementopattern;

/**
 * @author Admin
 * express originator class 
 */
public class Emp {
	
	private String  name;
	
	private double salary;
	
	private int age;
	
	public Emp(String name, double salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	/**
	 * memorandum operation
	 * @return
	 */
	public EmpMemento memoOperate(){
		return new EmpMemento(this); 
	}
	
	/**
	 * recovery to specified memo status
	 * @param empMemento
	 */
	public void recovery(EmpMemento empMemento){
		this.name=empMemento.getName();
		this.salary=empMemento.getSalary();
		this.age=empMemento.getAge();
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
