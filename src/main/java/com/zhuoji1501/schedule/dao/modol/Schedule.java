package com.zhuoji1501.schedule.dao.modol;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity  
@Table(name = "t_schedule")
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "s_id")
	private Integer sId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "u_id")
	private User user;
	
	@Column(name = "s_week" , length = 10) 
	private String sWeek;//用1到18表示
	
	@Column(name = "s_day" , length = 10) 
	private String sDay;//用1到7表示
	
	@Column(name = "s_class" , length = 10) 
	private String sClass;//用1到5表示

	public Schedule() {
		super();
	}

	public Schedule(Integer sId, User user, String sWeek, String sDay, String sClass) {
		super();
		this.sId = sId;
		this.user = user;
		this.sWeek = sWeek;
		this.sDay = sDay;
		this.sClass = sClass;
	}

	@Override
	public String toString() {
		return "Schedule [sId=" + sId + ", user=" + user + ", sWeek=" + sWeek + ", sDay=" + sDay + ", sClass=" + sClass
				+ "]";
	}

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getsWeek() {
		return sWeek;
	}

	public void setsWeek(String sWeek) {
		this.sWeek = sWeek;
	}

	public String getsDay() {
		return sDay;
	}

	public void setsDay(String sDay) {
		this.sDay = sDay;
	}

	public String getsClass() {
		return sClass;
	}

	public void setsClass(String sClass) {
		this.sClass = sClass;
	}
	
}
