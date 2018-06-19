package org.cn.kkl.behavioralmodel.chainofresponsibility;

public class Manager extends Leader {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(10>request.getDays()){
			System.out.println("employee "+ request.getEmpName()+" leave request approval pass by "+ this.name);
		}else{
			if (this.nextLeader!=null) {
				this.nextLeader.handleRequest(request);
			}
		}
	}


}
