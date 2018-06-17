package org.cn.kkl.createdmodel.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Computer3 implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7089031678477378257L;

	private String brand;
	
	private Date proDate;
	
	private String os;
	
	private int processor;
	
	private int size;

	public Computer3() {
		super();
	}

	public Computer3(String brand, String os, int processor, int size,Date proDate) {
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
	 * use serialization and anti serialization achieve deep clone
	 */
	public Computer3 clone() {
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ByteArrayInputStream bai=null;
		ObjectInput oi=null;
		ObjectOutput oo=null;
		try {
			oo=new ObjectOutputStream(bao);
			oo.writeObject(this);
			
			bai=new ByteArrayInputStream(bao.toByteArray());
			oi=new ObjectInputStream(bai);
			return (Computer3) oi.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			if(oi!=null){
				try {
					oi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bai!=null){
				try {
					bai.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(oo!=null){
				try {
					oo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bao!=null){
				try {
					bao.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return null;
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
