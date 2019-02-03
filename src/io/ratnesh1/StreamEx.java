package io.ratnesh1;

import java.util.Arrays;
import java.util.List;

import io.ratnesh.Person;

public class StreamEx {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("A", "B",1),
				new Person("C", "D",2),
				new Person("P", "Q",3),
				new Person("X", "Y",4)
				);
		
		// Streams - SOURCE -> OPERATION(S) -> TERMINAL OPERATION
		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.forEach(p -> System.out.println(p.getFirstName()));
		
		long l = people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.count();
		
		// people.parallelStream() -> for multithreading/parallel tasking -> result will be same but will divide the processing
	}

}
