package io.ratnesh;

public class ClosuresEx {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;	// it must be DECLARED final before java 8 so it frezzes the value if tried to change later then it complain
		doProcess(a, new Process() {
			
			@Override
			public void process(int i) {
				System.out.println(a+b);
				
			}
		});
		
		doProcess(a, k -> System.out.println(a+b));
	}

	
	public static void doProcess(int i, Process p){ // this process will contain the forzon value to b so whereever lambda exp goes b goes
		p.process(i);
	}
}

interface Process{
	void process(int i);
	
}