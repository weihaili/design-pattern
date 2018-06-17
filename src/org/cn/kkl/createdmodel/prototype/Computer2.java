package org.cn.kkl.createdmodel.prototype;

import java.util.Date;

/**
 * @author Admin
 * deep clone
 *
 */
public class Computer2 implements Cloneable{
	
	private String brand;
	
	private Date proDate;
	
	private String os;
	
	private int processor;
	
	private int size;

	public Computer2() {
		super();
	}

	public Computer2(String brand, String os, int processor, int size, Date proDate) {
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
	 * deep clone
	 * prototype field object is realized clone,they use the different field object
	 */
	public Object clone() throws CloneNotSupportedException {
		Computer2 obj=(Computer2) super.clone();
		obj.proDate=(Date) this.proDate.clone();
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
