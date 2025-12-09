package com.java.labdaexpression;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;

class Display{
	static void show(String s) {
		System.out.println("****** + s +*******");
	}
	void show1(String s) {
		System.out.println("****** + s +*******");
	}
	String getName() {
		return "TNSIF";
	}
}
public class UsingFunctionalInterface {

	public static void main(String[] args) {
		// Inbuilt Functional Interfaces
		Consumer<String> consumer = (str) -> {System.out.println("Welcome "+ str);};
		consumer.accept("Rohit");
		
		Supplier<String> sup = () -> "Hello from Supplier";
		System.out.println(sup.get());
		
		Supplier<Display> displaySupplier = Display::new;
		
		Predicate<Integer> predicate = num -> num>0;
		System.out.println(predicate.test(24));
		System.out.println(predicate.test(-24));
	}

}
