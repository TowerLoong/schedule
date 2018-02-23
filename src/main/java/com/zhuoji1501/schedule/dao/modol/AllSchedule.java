package com.zhuoji1501.schedule.dao.modol;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "t_all_schedule")
public class AllSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "all_id")
	private Integer allId;
	
	@Column(name = "all_week" , length = 10) 
	private String allWeek;//用1到18表示
	
	@Column(name = "all_day" , length = 10) 
	private String allDay;//用1到7表示
	
	@Column(name = "all_class" , length = 10) 
	private String allClass;//用1到5表示
	
	@Column(name = "all_frequent") 
	private Integer allFrequent;//表示某一个时间段有时间的人数

	public AllSchedule() {
		super();
	}

	public AllSchedule(Integer allId, String allWeek, String allDay, String allClass, Integer allFrequent) {
		super();
		this.allId = allId;
		this.allWeek = allWeek;
		this.allDay = allDay;
		this.allClass = allClass;
		this.allFrequent = allFrequent;
	}

	@Override
	public String toString() {
		return "AllSchedule [allId=" + allId + ", allWeek=" + allWeek + ", allDay=" + allDay + ", allClass=" + allClass
				+ ", allFrequent=" + allFrequent + "]";
	}

	public Integer getAllId() {
		return allId;
	}

	public void setAllId(Integer allId) {
		this.allId = allId;
	}

	public String getAllWeek() {
		return allWeek;
	}

	public void setAllWeek(String allWeek) {
		this.allWeek = allWeek;
	}

	public String getAllDay() {
		return allDay;
	}

	public void setAllDay(String allDay) {
		this.allDay = allDay;
	}

	public String getAllClass() {
		return allClass;
	}

	public void setAllClass(String allClass) {
		this.allClass = allClass;
	}

	public Integer getAllFrequent() {
		return allFrequent;
	}

	public void setAllFrequent(Integer allFrequent) {
		this.allFrequent = allFrequent;
	}
	
}
