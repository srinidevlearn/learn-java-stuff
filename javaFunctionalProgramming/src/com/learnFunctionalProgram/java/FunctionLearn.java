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
public class FunctionLearn {

	public FunctionLearn() {
		/**
		 * Function<T,R> 
		 * where 
		 * 		- T is the input type generic 
		 * 		- R is the output type generic
		 * It contains one abstract method namely accept()
		 * 
		 * Capitalize the words
		 * input is of String and output is of String
		 * 
		 * 
		 */
		Function<String,String> capitalize = words -> {
			// regex for newline and white space "\n| "
			 String[] pieces = words.split("\n| ");
			 String d = Arrays.stream(pieces).map(el->{
				 return new StringBuilder().append(el.substring(0, 1).toUpperCase()).append(el.substring(1, el.length())).toString();
			 }).collect(Collectors.joining(" "));
			 System.out.println("From function :  "+d);
			return  "";
			
		};
		
		capitalize.apply("Jack and jill went up hill");
	}
	
}
