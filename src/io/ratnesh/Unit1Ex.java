package io.ratnesh;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Ex {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("A", "B",1),
				new Person("C", "D",2),
				new Person("P", "Q",3),
				new Person("X", "Y",4)
				);

		//Step 1
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.getLastName().compareTo(arg1.getLastName());
			}
		});
		
//		Comparator<Person> c = (p1, p2) -> p1.getLastName().compareTo(p1.getLastName());
//		Collections.sort(people, c);
		Collections.sort(people, (arg0, arg1) -> arg0.getLastName().compareTo(arg1.getLastName()));
	
		//Step 2
		printAll(people);
		printConditionally(people, p -> true);
		printConditionally1(people, k -> true, k -> System.out.println(k));
		printConditionally1(people, k -> true, System.out::println);

		//Step 3.
		printConditionally(people, new Predicate<Person>(){	//new Condition(){

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
			
		});
		printConditionally(people, p -> p.getLastName().startsWith("C"));
	}

	private static void printConditionally(List<Person> people, Predicate<Person> condition){   //Condition condition) {
		for(Person p : people ){
			if(condition.test(p)){
				System.out.println(p);
			}			
		}
	}
	
	private static void printConditionally1(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer){   //Condition condition) {
		for(Person p : people ){
			if(condition.test(p)){
				consumer.accept(p);
			}			
		}
	}

	private static void printAll(List<Person> people) {
		for(Person p : people ){
			System.out.println(p);
		}		
	}
	
	interface Condition{
		boolean test(Person p);
	}

	
	
}
