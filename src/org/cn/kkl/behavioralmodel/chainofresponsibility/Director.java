package org.cn.kkl.behavioralmodel.chainofresponsibility;

public class Director extends Leader {
	
	
	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(3>request.getDays()){
			System.out.println("employee "+ request.getEmpName()+" leave request approval pass by "+ this.name);
		}else{
			if (this.nextLeader!=null) {
				this.nextLeader.handleRequest(request);
			}
		}
	}

}
