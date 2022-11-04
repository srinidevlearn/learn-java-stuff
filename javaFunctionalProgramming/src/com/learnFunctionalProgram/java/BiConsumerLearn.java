/**
 * 
 */
package com.learnFunctionalProgram.java;
import java.util.*;
import java.util.Arrays;
import java.util.function.*;


class User2{
	String name;
	int age;
	String gender;
	User2(String name,int age,String gender){
		this.name = name;
		this.age =age;
		this.gender = gender;
	}
	  public String toString()
	   {
	        return "{"
	        		+ "name : "+ name + " , "
	        		+ "age : "+ age + " , "
	        		+ "gender : "+ gender
	        		+ "}";
	    }
	 
}

/**
 * @author rsrin
 *
 */
public class BiConsumerLearn {

	public BiConsumerLearn() {
		/**
		 * Consumer<T,U> 
		 * where 
		 * 		- T is the input type generic for first argument
		 * 		- T is the input type generic for second argument
		 * can use for void kind of operations
		 * It contains one abstract method namely accept()
		 * Consumer can be used in all contexts where an object needs to be consumed,
		 * just take input and do all required operations and return nothing
		 * 
		 */
		
		
		
		BiConsumer<List<User2>,Integer> femaleFilter = (users,ageFilter) ->{
			System.out.println(ageFilter);
			users.stream()
			.filter(e-> e.age > ageFilter)
			.forEach(e-> System.out.println("From bi-consumer-function : "+e.toString()));
		};
		User2[] users = {
				new User2("AAA",20,"M"),
				new User2("BBB",10,"M"),
				new User2("CCC",30,"F"),
				new User2("DDD",50,"M"),
				new User2("CCC",17,"F")
		};
		Integer ageFilter = 28;
		femaleFilter.accept(Arrays.asList(users),ageFilter);
		
	}
	
}
