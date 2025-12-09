package com.java.labdaexpression;

import java.util.stream.Stream;
import java.util.function.Function;

public class LambdaWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m = (name) ->{
			System.out.println("Hello "+ name );
		};
		m.greet("Rohit");
		
		Cube c = (a) ->{
			return (a*a*a);
		};
		System.out.println(c.calculate(4));
		
		IsOdd o = (a) -> a%2 != 0? true:false;
		System.out.println(o.checkOdd(56));
		System.out.println(o.checkOdd(9));
		
		
		/* Tomorrow has to be asked to do it
		 * Stream<Integer> stream = Stream.of(10,20,30,40,50); Function<Integer,Integer>
		 * sqr(n)-> n*n;
		 */
		
		
	}

}
