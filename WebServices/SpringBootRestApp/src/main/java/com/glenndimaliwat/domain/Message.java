package com.glenndimaliwat.domain;

public class Message {
	int id;
	String name;
    String text;
    
    public Message(){}

	public Message(int id, String name, String text) {
		this.id = id;
		this.name = name;
		this.text = text;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}