package org.cn.kkl.createdmodel.prototype;

import java.util.Date;

public class Computer implements Cloneable{
	
	private String brand;
	
	private Date proDate;
	
	private String os;
	
	private int processor;
	
	private int size;

	public Computer() {
		super();
	}

	public Computer(String brand, String os, int processor, int size, Date proDate) {
		this();
		this.brand = brand;
		this.os = os;
		this.processor = processor;
		this.size = size;
		this.proDate=proDate;
	}

	public Date getProDate() {
		return proDate;
	}

	public void setProDate(Date proDate) {
		this.proDate = proDate;
	}

	/* 
	 * shallow clone
	 * prototype field object is not realized clone,they use the same one field object
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj=super.clone();
		return obj;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getProcessor() {
		return processor;
	}

	public void setProcessor(int processor) {
		this.processor = processor;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", proDate=" + proDate + ", os=" + os + ", processor=" + processor
				+ ", size=" + size + "]";
	}

}
