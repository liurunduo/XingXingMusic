package com.starmusic.entity;

import java.sql.Date;

/**
 * Information entity. @author MyEclipse Persistence Tools
 */

public class Information{

	// Fields

	private Integer informId;	//资讯编号
	private String message;		//资讯
	private Date date;			//日期

	// Constructors

	/** default constructor */
	public Information() {
	}

	/** full constructor */
	public Information(String message, Date date) {
		this.message = message;
		this.date = date;
	}

	// Property accessors

	public Integer getInformId() {
		return this.informId;
	}

	public void setInformId(Integer informId) {
		this.informId = informId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}