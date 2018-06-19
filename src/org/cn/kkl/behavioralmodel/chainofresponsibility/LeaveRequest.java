package org.cn.kkl.behavioralmodel.chainofresponsibility;

public class LeaveRequest {
	
	private String empName;
	
	private int days;
	
	private String reason;

	public LeaveRequest(String empName, int days, String reason) {
		this();
		this.empName = empName;
		this.days = days;
		this.reason = reason;
	}

	public LeaveRequest() {
		super();
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	

}
