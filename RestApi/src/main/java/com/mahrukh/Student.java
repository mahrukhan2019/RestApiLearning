package com.mahrukh;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Student {
	
	//variables
	@Id
	int id;
	String name_;
	int age_;
	String classname;
	
	
	//getter and setter
	public String getName() {
		return name_;
	}
	public void setName(String name) {
		this.name_ = name;
	}
	public int getAge() {
		return age_;
	}
	public void setAge(int age) {
		this.age_ = age;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//to string
	@Override
	public String toString() {
		return "Student [id=" + id + ", name_=" + name_ + ", age_=" + age_ + ", classname=" + classname + "]";
	}
	
	
	
	
	
	

}
