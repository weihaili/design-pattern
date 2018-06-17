package org.cn.kkl.createdmodel.prototype;

import java.util.Date;


public class Client {

	public static void main(String[] args) {
		Client c=new Client();
		c.test01();
		System.out.println("*******************************");
		c.test02();
		System.out.println("***********************************");
		c.test03();
		System.out.println("**********************************");
		c.test04();
		c.test05();
	}

	/**
	 * test clone object effectiveness 
	 */
	private void test05() {
		Computer cp=new Computer();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			try {
				cp.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("clone object spend time "+(end-start)+" ms");
	}

	/**
	 * test new object effectiveness 
	 */
	private void test04() {
		Long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			new Computer();
		}
		Long end = System.currentTimeMillis();
		System.out.println("new Object spend time "+(end-start)+" ms");
	}

	/**
	 *test use serialization and anti serialization achieve deep clone
	 */
	private void test03() {
		Date date = new Date();
		date.setTime(67668686832L);
		Computer3 cp=new Computer3("kkl", "wbt", 4, 14, date);
		System.out.println("clone before :"+cp.toString()+"hashcode"+cp.hashCode());
		Computer3 cp1=cp.clone();
		System.out.println("clone object "+cp1.toString()+" hashcode"+cp1.hashCode());
		date.setTime(System.currentTimeMillis());
		System.out.println(cp.getProDate());
		System.out.println(cp1.getProDate());
	}

	/**
	 * test shallow clone
	 */
	private void test01() {
		Date date=new Date();
		date.setTime(787878783L);
		
		try {
			Computer computer = new Computer("lenovo", "linux", 8, 17);
			computer.setProDate(date);
			System.out.println("clone before: "+computer.toString()+" hashcode :"+computer.hashCode());
			
			Computer computer2 = (Computer) computer.clone();
			System.out.println("clone object : "+computer2.toString()+" hashcode : "+computer2.hashCode());
			date.setTime(System.currentTimeMillis());
			System.out.println("update proDate : "+computer.getProDate()+" hashcode :"+computer.hashCode());
			System.out.println("update proDate : "+computer2.getProDate()+" hashcode : "+computer2.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * deep clone 
	 */
	private void test02(){
		Date date=new Date();
		date.setTime(787372329323l);
		
		Computer2 computer2=new Computer2("wxr", "linux", 32, 17, date);
		System.out.println("clone before :" + computer2.toString()+" hashcode :"+computer2.hashCode());
		
		try {
			Computer2 computer22=(Computer2) computer2.clone();
			System.out.println("clone object : "+computer22.toString()+" hashcode : "+computer22.hashCode());
			date.setTime(System.currentTimeMillis());
			System.out.println(computer2.getProDate());
			System.out.println(computer22.getProDate());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
