package hibernatedemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 	// Entity is a annotation used for create the table implicitly as class name
public class Student {
	
	@Id 	// Id is a annotation used for set a primary key 
			//only we have to write above the data type this annotation i'm setting id data type a primary key 
	private int id ;
	private String name;
	private int age;
	
	// getter and setter method
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
