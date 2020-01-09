package com.deloitte.demo.model;

public class Restaurant {
	
	String rid;
	String rname;
	String stopId;
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getStopId() {
		return stopId;
	}
	public void setStopId(String StopId) {
		this.stopId = StopId;
	}
	@Override
	public String toString() {
		return "Restaurant [rid=" + rid + ", rname=" + rname + ", StopId=" + stopId + "]";
	}

}
