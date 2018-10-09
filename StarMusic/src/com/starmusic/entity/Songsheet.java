package com.starmusic.entity;

/**
 * Songsheet entity. @author MyEclipse Persistence Tools
 */

public class Songsheet{

	// Fields

	private Integer songsheetId;			//歌单ID
	private String introduce;				//介绍
	private String songsheetName;			//歌单名字
	private Integer userId;					//用户ID
	private Integer songsheetCategoryId;	//歌单分类ID
	private Integer clickAmount;			//点击数

	// Constructors

	/** default constructor */
	public Songsheet() {
	}

	/** minimal constructor */
	public Songsheet(String songsheetName, Integer userId, Integer songsheetCategoryId) {
		this.songsheetName = songsheetName;
		this.userId = userId;
		this.songsheetCategoryId = songsheetCategoryId;
	}

	/** full constructor */
	public Songsheet(String introduce, String songsheetName, Integer userId, Integer songsheetCategoryId,
			Integer clickAmount) {
		this.introduce = introduce;
		this.songsheetName = songsheetName;
		this.userId = userId;
		this.songsheetCategoryId = songsheetCategoryId;
		this.clickAmount = clickAmount;
	}

	// Property accessors

	public Integer getSongsheetId() {
		return this.songsheetId;
	}

	public void setSongsheetId(Integer songsheetId) {
		this.songsheetId = songsheetId;
	}

	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getSongsheetName() {
		return this.songsheetName;
	}

	public void setSongsheetName(String songsheetName) {
		this.songsheetName = songsheetName;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getSongsheetCategoryId() {
		return this.songsheetCategoryId;
	}

	public void setSongsheetCategoryId(Integer songsheetCategoryId) {
		this.songsheetCategoryId = songsheetCategoryId;
	}

	public Integer getClickAmount() {
		return this.clickAmount;
	}

	public void setClickAmount(Integer clickAmount) {
		this.clickAmount = clickAmount;
	}

}