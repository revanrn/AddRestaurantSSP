package com.example.demo.model;

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
		int routeId;
		int stopId;
		int stopId1;
		int stopId2;

		public int getStopId1() {
			return stopId1;
		}

		public void setStopId1(int stopId1) {
			this.stopId1 = stopId1;
		}

		public int getStopId2() {
			return stopId2;
		}

		public void setStopId2(int stopId2) {
			this.stopId2 = stopId2;
		}

		public int getStopId() {
			return stopId;
		}

		public void setStopId(int stopId) {
			this.stopId = stopId;
		}

		public int getRouteId() {
			return routeId;
		}

		public void setRouteId(int routeId) {
			this.routeId = routeId;
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

		@Override
		public String toString() {
			return "Location [routeId=" + routeId + ", from=" + from + ", to=" + to + ", fromTime=" + fromTime + ", toTime="
					+ toTime + ", stop1=" + stop1 + ", stop2=" + stop2 + ", stop3=" + stop3 + ", time1=" + time1
					+ ", time2=" + time2 + ", time3=" + time3 + ", trainNo=" + trainNo + "]";
		}

	}


