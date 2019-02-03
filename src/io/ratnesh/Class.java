package io.ratnesh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Class {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		testing();
//		checkArmstrong();
		
//		doSomething(100.0);
//		String str = "2.12";
//		System.out.println("==" + Double.parseDouble(str));
	}

	public static  void doSomething(Object obj) {
	    System.out.println("Array called");
	} 
	
	public static  void doSomething(Number obj) {
	    System.out.println("Number called");
	}
	
	public static  void testing() {
		List<String> list = new ArrayList<>();
		for(int i = 0; i<=1000; i++){
			list.add(""+i);
		}
		
		for(int i = 0; i<1000; i+=500){
			System.out.println("i = " + list.get(i));
		}
//		
//		list.forEach(bbb -> {
//			System.out.println(bbb);
//		});
		
		List<String> evenIndexedNames = IntStream
			      .range(0, list.size())
			      .filter(i -> i % 2 == 0)
			      .mapToObj(i -> list.get(i))
			      .collect(Collectors.toList());
		
//		System.out.println("1 = " + evenIndexedNames);
	}
	
	

	public static void checkArmstrong() throws IOException {
		 
		InputStreamReader reader = new InputStreamReader(System.in,StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		
		while ((line = in.readLine()) != null){
			System.out.println(line);
			int c = 0, a, temp;
			int n = Integer.parseInt(line);// It is the number to check armstrong
			temp = n;
			while (n > 0) {
				a = n % 10;
				n = n / 10;
				c = c + (a * a * a);
			}
			if (temp == c)
				System.out.println("armstrong number");
			else
				System.out.println("Not armstrong number");
		}

	}

}
