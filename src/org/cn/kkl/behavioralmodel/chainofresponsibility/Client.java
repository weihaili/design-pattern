package org.cn.kkl.behavioralmodel.chainofresponsibility;

public class Client {
	
	public static void main(String[] args) {
		Client client = new Client();
		client.test01();
	}

	private void test01() {
		Leader a=new Director("monkey");
		Leader b=new Manager("tiger");
		Leader c=new GeneralManager("lion");
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		LeaveRequest leaveInfo= new LeaveRequest("snake", 5, "waist sprained");
		a.handleRequest(leaveInfo);
		
		
	}
	
	

}
