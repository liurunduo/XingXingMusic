package com.starmusic.entity;

/**
 * Mv entity. @author MyEclipse Persistence Tools
 */

public class Mv{

	// Fields

	private Integer mvId;	
	private String link;	//mv路径连接
	private String songId;	//歌曲ID

	// Constructors

	/** default constructor */
	public Mv() {
	}

	/** minimal constructor */
	public Mv(Integer mvId, String songId) {
		this.mvId = mvId;
		this.songId = songId;
	}

	/** full constructor */
	public Mv(Integer mvId, String link, String songId) {
		this.mvId = mvId;
		this.link = link;
		this.songId = songId;
	}

	// Property accessors

	public Integer getMvId() {
		return this.mvId;
	}

	public void setMvId(Integer mvId) {
		this.mvId = mvId;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getSongId() {
		return this.songId;
	}

	public void setSongId(String songId) {
		this.songId = songId;
	}

}