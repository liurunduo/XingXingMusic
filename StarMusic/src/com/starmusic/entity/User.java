package com.starmusic.entity;

import java.sql.Date;
import java.util.List;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User{

	// Fields

	private Integer userId;		//用户ID
	private String loginName;	//登录名
	private String userName;	//用户名
	private String password;	//密码
	private Integer sex;		//性别 男1 女0
	private String introduce;	//介绍
	private Date birthday;		//生日
	private Integer areaId;		//地区ID
	private Integer isAdmin;	//是否管理员 (1管理员 2普通用户)
	private List<Songsheet> songsheetList;	//用户的歌单
	private List<Comment> commentList;		//用户的评论
	// Constructors

	/** default constructor */
	public User() {
	}

	public User(Integer userId, String loginName, String userName, String password, Integer sex, String introduce,
			Date birthday, Integer areaId, Integer isAdmin, List<Songsheet> songsheetList, List<Comment> commentList) {
		super();
		this.userId = userId;
		this.loginName = loginName;
		this.userName = userName;
		this.password = password;
		this.sex = sex;
		this.introduce = introduce;
		this.birthday = birthday;
		this.areaId = areaId;
		this.isAdmin = isAdmin;
		this.songsheetList = songsheetList;
		this.commentList = commentList;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Integer getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

	public List<Songsheet> getSongsheetList() {
		return songsheetList;
	}

	public void setSongsheetList(List<Songsheet> songsheetList) {
		this.songsheetList = songsheetList;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

}