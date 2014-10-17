package com.qian.diyuzhe.entity;


/*********
 * 
 * @author 千帐灯
 * @file  Article.java
 * @time 上午11:46:39
 */
public class Article  extends BaseObject{

	private int id;

	private String title;

	private String synopsis;

	private String contents;
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

 
 
	
}
