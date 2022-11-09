package com.capgemini.in.SetterSpringUsingObject;

public class Company {
	String com_name;
	String com_id;
	public String getCom_name() {
		return com_name;
	}
	public void setCom_name(String com_name) {
		this.com_name = com_name;
	}
	public String getCom_id() {
		return com_id;
	}
	public void setCom_id(String com_id) {
		this.com_id = com_id;
	}
	@Override
	public String toString() {
		return "Company [com_name=" + com_name + ", com_id=" + com_id + "]";
	}
	
}
