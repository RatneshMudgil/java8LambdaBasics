package io.ratnesh;

public class Overriding {
	
	
	public static void main(String args[]){  
		Overriding obj = new Overriding2();
		Overriding2 obj2 = new Overriding2();
		obj.deeksha(); 
		//obj2.deeksha();
		}
	
	
	void deeksha(){
		System.out.println("deekshaMethod");
	}

}

class Overriding2 extends Overriding{
	
	/*void deeksha(){
		System.out.println("ratneshMethod");
	}*/
}