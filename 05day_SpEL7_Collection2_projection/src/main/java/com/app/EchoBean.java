package com.app;

public class EchoBean {
	private String name;
	private int age;
	
	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EchoBean(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EchoBean [name=" + name + ", age=" + age + "]";
	}
}
