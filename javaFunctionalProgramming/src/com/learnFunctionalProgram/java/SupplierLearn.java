/**
 * 
 */
package com.learnFunctionalProgram.java;
import java.util.*;
import java.util.Arrays;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class User3{
	String name;
	Integer age;
	String gender;
	User3(String name,int age,String gender){
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
public class SupplierLearn {

	public SupplierLearn() {
		/**
		 * Supplier<T> 
		 * where 
		 * 		- T is the return type generic
		 * It contains one abstract method namely get()
		 * Supplier can be used in all contexts where an object needs to be supplied,
		 * just return result after doing all required operations and accepts no parameters
		 * 
		 */
		
		User3[] users = {
				new User3("AAA",20,"M"),
				new User3("BBB",10,"M"),
				new User3("CCC",30,"F"),
				new User3("DDD",50,"M"),
				new User3("CCC",17,"F")
		};
	
		Supplier<ArrayList<User3>> femaleFilter = () ->{
					ArrayList<User3> list = new ArrayList<>();
					Stream.of(users)
			.filter(e->( e.gender == "F" ))
			
			.forEach(list::add);
			return list;
			
		};
	
		System.out.println("From supplier : "+femaleFilter.get());
		
	}
	
}
