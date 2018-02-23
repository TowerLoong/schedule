package com.zhuoji1501.schedule.dao.modol;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 2018.2.24
 * @author Tower
 * 用户信息表
 */
@Entity  
@Table(name = "t_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "u_id")
	private Integer uId;
	
	@Column(name = "u_name", nullable = false , length = 20) 
	private String uName;
	
	@Column(name = "u_password", nullable = false , length = 20) 
	private String uPassword;

	public User() {
		super();
	}

	public User(Integer uId, String uName, String uPassword) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uPassword = uPassword;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPassword=" + uPassword + "]";
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	
}
