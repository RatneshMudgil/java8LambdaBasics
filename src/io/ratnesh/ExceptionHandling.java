package io.ratnesh;

import java.util.function.BiConsumer;

public class ExceptionHandling {

	public static void main(String[] args) {

		int [] someNumbers = {1,2,3,4};
		int k = 2;
		
		process(someNumbers, k,  (a,b) ->  System.out.println(a+b));
		process(someNumbers, k,  wrapperLambda((a,b) ->  System.out.println(a/b)));
		
//		process(someNumbers, k,  (a,b) ->  {
//			try{
//				System.out.println(a/b);
//			} catch(ArithmeticException e){
//				
//			}
//			
//		});
	}

	private static void process(int[] someNumbers, int k, BiConsumer<Integer, Integer> consumer) {
		for(int i:someNumbers){
//			try{
				consumer.accept(i,k);
//			} catch(ArithmeticException e){
//				
//			}			
		}		
	}
	
	// Exception wrapper
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
//		return consumer;
//		return (a,b) -> System.out.println(a+b);
		
		return (a,b) -> {
			try{
				consumer.accept(a, b);
			} catch(ArithmeticException e){
				System.out.println("Exception caught in wrapper lambda");
			}
		};
	}

}
