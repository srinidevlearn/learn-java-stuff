/**
 * 
 */
package com.learnFunctionalProgram.java;
import java.util.Arrays;
import java.util.function.*;
import java.util.stream.Collectors;
/**
 * @author rsrin
 *
 */
public class BiFunctionLearn {

	public BiFunctionLearn() {
		/**
		 * BiFunction<T,U,R> 
		 * where 
		 * 		- T is the input type generic for first arguments
		 * 		- U is the input type generic for second arguments
		 * 		- R is the output type generic
		 * It contains one abstract method namely accept()
		 * 
		 * 
		 */
		BiFunction<String,String,String> fullName = (String fName,String lName) -> {
			
				 String res =  new StringBuilder().append(fName).append(" ").append(lName).toString();
				 System.out.println("From bi-function : "+res);			
				 return res;
			
		};
		
		fullName.apply("Xavier","Britto");
	}
	
}
