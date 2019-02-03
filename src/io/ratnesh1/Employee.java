package io.ratnesh1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	public static void main(String [] str) {
		
		Student s = new Student();
		s.setId(10);
		s.setName("Deeksha");
		
		Student s1 = new Student(2, "Deeksh");

		System.out.println("11 = " + s1.getId());
		System.out.println("11 = " + s1.getName());
		
		List<String> list = new ArrayList<String>(); 
		ImmutableStudent student = new ImmutableStudent(1, "Deeksha", list);
		
	}
}


class Student {

private int id;
private String name;

Student(){
	System.out.println("default cons");
}

Student(int id, String name){
	System.out.println("para cons");
	this.id = id;
	this.name = name;
}

public int getId(){
	return id;
}

public void setId(int id){
	this.id = id;
}

public String getName(){
	return name;
}

public void setName(String name){
	this.name = name;
}
	

}
