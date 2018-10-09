package com.starmusic.entity;

import java.sql.Date;

/**
 * Song entity. @author MyEclipse Persistence Tools
 */

public class Song{

	// Fields

	private Integer songId;		//歌曲ID	
	private Integer specilId;	//所属专辑ID
	private Integer singerId;	//歌手ID
	private Integer mvid;		
	private String songLink;	//歌曲链接路径
	private String songName;	//歌曲 名字
	private String lyric;		//歌词
	private String remark;		//备注
	private String creat;		//创作背景
	private Date publishDate;	//出版日期
	private Integer clickAmount;	//点击总数
	private Integer downloadAmount;	//下载总数
	private Integer songsheetId;	//歌单ID

	// Constructors

	/** default constructor */
	public Song() {
	}

	/** minimal constructor */
	public Song(Integer specilId, Integer singerId, Integer mvid, Integer songsheetId) {
		this.specilId = specilId;
		this.singerId = singerId;
		this.mvid = mvid;
		this.songsheetId = songsheetId;
	}

	/** full constructor */
	public Song(Integer specilId, Integer singerId, Integer mvid, String songLink, String songName, String lyric,
			String remark, String creat, Date publishDate, Integer clickAmount, Integer downloadAmount,
			Integer songsheetId) {
		this.specilId = specilId;
		this.singerId = singerId;
		this.mvid = mvid;
		this.songLink = songLink;
		this.songName = songName;
		this.lyric = lyric;
		this.remark = remark;
		this.creat = creat;
		this.publishDate = publishDate;
		this.clickAmount = clickAmount;
		this.downloadAmount = downloadAmount;
		this.songsheetId = songsheetId;
	}

	// Property accessors

	public Integer getSongId() {
		return this.songId;
	}

	public void setSongId(Integer songId) {
		this.songId = songId;
	}

	public Integer getSpecilId() {
		return this.specilId;
	}

	public void setSpecilId(Integer specilId) {
		this.specilId = specilId;
	}

	public Integer getSingerId() {
		return this.singerId;
	}

	public void setSingerId(Integer singerId) {
		this.singerId = singerId;
	}

	public Integer getMvid() {
		return this.mvid;
	}

	public void setMvid(Integer mvid) {
		this.mvid = mvid;
	}

	public String getSongLink() {
		return this.songLink;
	}

	public void setSongLink(String songLink) {
		this.songLink = songLink;
	}

	public String getSongName() {
		return this.songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getLyric() {
		return this.lyric;
	}

	public void setLyric(String lyric) {
		this.lyric = lyric;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreat() {
		return this.creat;
	}

	public void setCreat(String creat) {
		this.creat = creat;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Integer getClickAmount() {
		return this.clickAmount;
	}

	public void setClickAmount(Integer clickAmount) {
		this.clickAmount = clickAmount;
	}

	public Integer getDownloadAmount() {
		return this.downloadAmount;
	}

	public void setDownloadAmount(Integer downloadAmount) {
		this.downloadAmount = downloadAmount;
	}

	public Integer getSongsheetId() {
		return this.songsheetId;
	}

	public void setSongsheetId(Integer songsheetId) {
		this.songsheetId = songsheetId;
	}

}