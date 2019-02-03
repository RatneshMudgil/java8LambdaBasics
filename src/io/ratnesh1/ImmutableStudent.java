package io.ratnesh1;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableStudent {
    
	private final int id;
    
	private final String name;
    
//	private final Age age;
	
	private final List<String> deekshaList;
    
	public ImmutableStudent(int id, String name, List<String> list) {
		this.name = name;
    	this.id = id;
    	this.deekshaList = list;
    }
    
	public int getId() {
		return id;
    }
    
	public String getName() {
		return name;
    }
    
    public List<String> getDeekshaList(){
    	
    	List<String> newDeekshaList = new ArrayList<String>();
    	
    	for(String dList : deekshaList){
    		newDeekshaList.add(dList);
    	}
    
    	return newDeekshaList;
    }
//    public Age getAge() {
//    Age a1 = new Age();
//    a1.setDate(age.getAge());
//    a1.setMonth(age.getMonth());
//    return a1;
//    return age;
//    }
}
