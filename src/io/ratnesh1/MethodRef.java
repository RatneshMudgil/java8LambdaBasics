package io.ratnesh1;

public class MethodRef {
	
	public static void main(String [] args){
		
//		Thread t = new Thread(() -> printMessage());
		Thread t = new Thread(MethodRef::printMessage);
		t.start();
		
	}

	
	public static void printMessage(){
		System.out.println("Hello");
	}
}
