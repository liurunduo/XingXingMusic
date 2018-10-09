package com.starmusic.entity;

import java.util.List;

/**
 * Singer entity. @author MyEclipse Persistence Tools
 */

public class Singer{

	// Fields

	private Integer singerId;	//歌手ID
	private String singerName;	//歌手名字
	private Integer areaId;		//地区ID
	private String introduce;	//介绍
	private List<Special> specialList;	//歌手的专辑
	private List<Song> songList;		//歌手的歌
	// Constructors

	/** default constructor */
	public Singer() {
	}

	public Singer(Integer singerId, String singerName, Integer areaId, String introduce, List<Special> specialList,
			List<Song> songList) {
		super();
		this.singerId = singerId;
		this.singerName = singerName;
		this.areaId = areaId;
		this.introduce = introduce;
		this.specialList = specialList;
		this.songList = songList;
	}

	// Property accessors

	public Integer getSingerId() {
		return this.singerId;
	}

	public void setSingerId(Integer singerId) {
		this.singerId = singerId;
	}

	public String getSingerName() {
		return this.singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public List<Special> getSpecialList() {
		return specialList;
	}

	public void setSpecialList(List<Special> specialList) {
		this.specialList = specialList;
	}

	public List<Song> getSongList() {
		return songList;
	}

	public void setSongList(List<Song> songList) {
		this.songList = songList;
	}

}