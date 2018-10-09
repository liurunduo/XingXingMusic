package com.starmusic.entity;

import java.sql.Date;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment {

	// Fields
	private Integer commentId;		//歌曲评论ID
	private Integer userId;			//发起评论用户ID
	private Integer songId;			//歌曲ID（一行与歌单Id只能存在一个）
	private Integer songsheetId;	//歌单Id（一行与歌曲Id只能存在一个）
	private Integer replytoUserId;	//回复谁（用户ID）	
	private String comment;			//评论内容
	private Date createDate;	//创建日期

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** minimal constructor */
	public Comment(Integer userId, String comment, Date createDate) {
		this.userId = userId;
		this.comment = comment;
		this.createDate = createDate;
	}

	/** full constructor */
	public Comment(Integer userId, Integer songId, Integer songsheetId, Integer replytoUserId, String comment,
			Date createDate) {
		this.userId = userId;
		this.songId = songId;
		this.songsheetId = songsheetId;
		this.replytoUserId = replytoUserId;
		this.comment = comment;
		this.createDate = createDate;
	}

	// Property accessors

	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getSongId() {
		return this.songId;
	}

	public void setSongId(Integer songId) {
		this.songId = songId;
	}

	public Integer getSongsheetId() {
		return this.songsheetId;
	}

	public void setSongsheetId(Integer songsheetId) {
		this.songsheetId = songsheetId;
	}

	public Integer getReplytoUserId() {
		return this.replytoUserId;
	}

	public void setReplytoUserId(Integer replytoUserId) {
		this.replytoUserId = replytoUserId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}