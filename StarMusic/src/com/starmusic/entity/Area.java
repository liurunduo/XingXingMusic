package com.starmusic.entity;

/**
 * Area entity. @author MyEclipse Persistence Tools
 */

public class Area{

	// Fields

	private Integer areaId;		//地区ID
	private String areaName;	//地区名称
	private Integer parentId;	//父级目录

	// Constructors

	/** default constructor */
	public Area() {
	}

	/** full constructor */
	public Area(String areaName, Integer parentId) {
		this.areaName = areaName;
		this.parentId = parentId;
	}

	// Property accessors

	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

}