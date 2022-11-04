/**
 * 
 */
package com.learnFunctionalProgram.java;
import java.util.*;
import java.util.Arrays;
import java.util.function.*;


class User{
	String name;
	Integer age;
	String gender;
	User(String name,int age,String gender){
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
public class ConsumerLearn {

	public ConsumerLearn() {
		/**
		 * Consumer<T> 
		 * where 
		 * 		- T is the input type generic for argument
		 * can use for void kind of operations
		 * It contains one abstract method namely accept()
		 * Consumer can be used in all contexts where an object needs to be consumed,
		 * just take input and do all required operations and return nothing
		 * 
		 */
		
		Consumer<String> myPrint = obj-> System.out.println(obj);
		myPrint.accept("From consumer-function : " + "Hello World");
		
		Consumer<List<User>> femaleFilter = (users) ->{
			users.stream()
			.filter(e->( e.age> 17 ))
			.forEach(e-> System.out.println("From consumer-function : "+e.toString()));
		};
		User[] users = {
				new User("AAA",20,"M"),
				new User("BBB",10,"M"),
				new User("CCC",30,"F"),
				new User("DDD",50,"M"),
				new User("CCC",17,"F")
		};
		femaleFilter.accept(Arrays.asList(users));
		
	}
	
}
