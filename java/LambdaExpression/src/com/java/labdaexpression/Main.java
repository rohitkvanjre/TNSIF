package com.java.labdaexpression;

@FunctionalInterface
interface Sayable{
	public void say();
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s = () ->{System.out.println("This is Sayable Functional Interface");};
		s.say();
	}

}
