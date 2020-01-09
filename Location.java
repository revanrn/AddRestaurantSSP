package com.deloitte.demo.model;

public class Location {
	String trainNo;
	String from;
	String to;
	String fromTime;
	String toTime;
	String stop1;
	String stop2;
	String stop3;
	String time1;
	String time2;
	String time3;
	String stopId;
  String routeid;
  
	
	public String getRouteid() {
	return routeid;
}

public String setRouteid(String routeid) {
	return this.routeid = routeid;
}

	public String getStopId() {
		return stopId;
	}

	public String setStopId(String stopId) {
		return this.stopId = stopId;
	}

	String rid;
	String rname;
	
	
	


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

	


	@Override
	public String toString() {
		return "Location [trainNo=" + trainNo + ", from=" + from + ", to=" + to + ", fromTime=" + fromTime + ", toTime="
				+ toTime + ", stop1=" + stop1 + ", stop2=" + stop2 + ", stop3=" + stop3 + ", time1=" + time1
				+ ", time2=" + time2 + ", time3=" + time3 + ", stopId=" + stopId + ", routeid=" + routeid + ", rid="
				+ rid + ", rname=" + rname + "]";
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFromTime() {
		return fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getToTime() {
		return toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

	public String getStop1() {
		return stop1;
	}

	public void setStop1(String stop1) {
		this.stop1 = stop1;
	}

	public String getStop2() {
		return stop2;
	}

	public void setStop2(String stop2) {
		this.stop2 = stop2;
	}

	public String getStop3() {
		return stop3;
	}

	public void setStop3(String stop3) {
		this.stop3 = stop3;
	}

	public String getTime1() {
		return time1;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	public String getTime2() {
		return time2;
	}

	public void setTime2(String time2) {
		this.time2 = time2;
	}

	public String getTime3() {
		return time3;
	}

	public void setTime3(String time3) {
		this.time3 = time3;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	
	
	
}
