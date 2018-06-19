package org.cn.kkl.behavioralmodel.chainofresponsibility;

public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(30>request.getDays()){
			System.out.println("employee "+ request.getEmpName()+" leave request approval pass by "+ this.name);
		}else{
			System.out.println("approval refuse by" + this.name);
		}
	}

}
