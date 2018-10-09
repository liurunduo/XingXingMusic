package com.starmusic.entity;

/**
 * SongsheetCategory entity. @author MyEclipse Persistence Tools
 */

public class SongsheetCategory{

	// Fields

	private Integer categoryId;		//歌单分类ID
	private String categoryName;	//歌单名字
	private Integer parentId;		//父级目录
	
	// Constructors

	/** default constructor */
	public SongsheetCategory() {
	}

	/** full constructor */
	public SongsheetCategory(String categoryName, Integer parentId) {
		this.categoryName = categoryName;
		this.parentId = parentId;
	}

	// Property accessors

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

}