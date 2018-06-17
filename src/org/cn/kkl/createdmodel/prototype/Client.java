package org.cn.kkl.createdmodel.prototype;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		Client c=new Client();
		c.test01();
		c.test02();
	}

	/**
	 * test shallow clone
	 */
	private void test01() {
		Date date=new Date();
		date.setTime(787878783L);
		
		Date date2 = new Date();
		
		Computer computer = new Computer("lenovo", "linux", 8, 17,date);
		System.out.println(computer.toString()+computer.hashCode());
		try {
			Computer computer2 = (Computer) computer.clone();
			System.out.println(computer2.toString()+computer2.hashCode());
			computer2.setProDate(date2);
			System.out.println(computer2.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
	private void test02(){
		Date date=new Date();
		date.setTime(787372329323l);
		
		Computer2 computer2=new Computer2("wxr", "linux", 32, 17, date);
		System.out.println(computer2);
		try {
			Computer2 computer22=(Computer2) computer2.clone();
			System.out.println(computer22.toString());
			computer22.setProDate(new Date());
			System.out.println(computer22.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
