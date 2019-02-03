package io.ratnesh1;

import java.util.Arrays;
import java.util.List;

import io.ratnesh.Person;

public class CollectionIterationEx {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("A", "B",1),
				new Person("C", "D",2),
				new Person("P", "Q",3),
				new Person("X", "Y",4)
				);

		// External iterator,  sequential
		for(int i=0 ; i < people.size() ; i++){
			System.out.println(people.get(i));
		}		
		for(Person p : people){
			System.out.println(p);
		}
		
		// I don't care about the order.. but each element should be executed.. Helps in mutlithreading and parallelism
		people.forEach(p -> System.out.println(p));
		people.forEach(System.out::println);

	}

}
