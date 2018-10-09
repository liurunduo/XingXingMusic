package com.starmusic.entity;

import java.sql.Date;
import java.util.List;

/**
 * Special entity. @author MyEclipse Persistence Tools
 */

public class Special{

	// Fields

	private Integer specialId;		//专辑编号
	private Integer singerId;		//歌手编号
	private String specialName;		//专辑名
	private Date publishDate;		//发行日期
	private List<Song> songList;	//专辑下歌曲集合
	private List<Comment> commentList;	//专辑评论
	// Constructors

	/** default constructor */
	public Special() {
	}

	public Special(Integer specialId, Integer singerId, String specialName, Date publishDate, List<Song> songList,
			List<Comment> commentList) {
		super();
		this.specialId = specialId;
		this.singerId = singerId;
		this.specialName = specialName;
		this.publishDate = publishDate;
		this.songList = songList;
		this.commentList = commentList;
	}

	// Property accessors

	public Integer getSpecialId() {
		return this.specialId;
	}

	

	public void setSpecialId(Integer specialId) {
		this.specialId = specialId;
	}

	public Integer getSingerId() {
		return this.singerId;
	}

	public void setSingerId(Integer singerId) {
		this.singerId = singerId;
	}

	public String getSpecialName() {
		return this.specialName;
	}

	public void setSpecialName(String specialName) {
		this.specialName = specialName;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public List<Song> getSongList() {
		return songList;
	}

	public void setSongList(List<Song> songList) {
		this.songList = songList;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	
}