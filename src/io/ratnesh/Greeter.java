package io.ratnesh;

public class Greeter {

	public void greet(Greeting greeting){
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
		Greeting helloWorldGreeting = new HelloWorldGreeting(); // (1) Created a new class and Specific implementation of a interface
		Greeting mylamdaFunc = () -> System.out.println("Hello World Lamda"); //(2) Just implementing a function and not a class -- Type inference
		
		Greeting innerClassGreeting = new Greeting() {		//(3) Anonymous inner class			
			@Override
			public void perform() {
				System.out.println("Inline Hollo");
				
			}
		};
		
		greeter.greet(helloWorldGreeting);
		greeter.greet(mylamdaFunc);
		greeter.greet(innerClassGreeting);
		
//		MyLambda mylamdaFunc = () -> System.out.println("Hello World Lamda");
//		MyAdd addFunction = (int a, int b) ->  a + b;
//		int k = addFunction.foo(2, 3);
//		System.out.println(k);
		
//		Runnable testingRun = () -> System.out.println("Testing");
//		Thread t = new Thread(testingRun);   // OR Thread t = new Thread(() -> System.out.println("Testing"));
//		t.start();
 	}

}
// Functional interface(Lambda specific): Interface having atleast one abstract method and other methods having body
/*interface MyLambda{
	void foo();
	
}*/

//@FunctionalInterface
//interface MyAdd{
//	int foo(int x, int y);
//	
//}