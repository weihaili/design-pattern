package org.cn.kkl.behavioralmodel.chainofresponsibility;

public abstract class Leader {
	
	protected String name;
	
	protected Leader nextLeader;

	public Leader getNextLeader() {
		return nextLeader;
	}

	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}

	public Leader() {
		super();
	}

	public Leader(String name) {
		this();
		this.name = name;
	}
	
	public abstract void handleRequest(LeaveRequest request);
	
	

}
