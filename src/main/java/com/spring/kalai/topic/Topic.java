package com.spring.kalai.topic;

public class Topic {
	
	private String id;
	private String name;
	private String desc;
	
	public Topic() {//no-argument constructor
	}
	
	public Topic(String id, String name, String desc) {//parameter constructor
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}
	//getter and setter methods
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

}