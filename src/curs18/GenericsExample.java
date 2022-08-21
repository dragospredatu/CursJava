package curs18;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {

		printDetails("Text", false);
		printDetails(123, 'c');
		printDetails(250.66, "Alt string");
		printDetails(true, 44);

		
		//List<String> lista = new ArrayList<E>();
		
	}

	public static <T> void printDetails(T obj, T obj2) {
		 
		System.out.println(" Obiectul meu  : " + obj);
		System.out.println(" Data type-ul obiectului meu  : " + obj.getClass().getName());

		
	}
	
	/*
	
	 public static void printDetails(String text) {
		 
		 System.out.println(" Obiectul meu  : " + text);
		 System.out.println(" Data type-ul obiectului meu  : " + text.getClass());

	 }
	 
	 public static void printDetails(Integer text) {
		 
		 System.out.println(" Obiectul meu  : " + text);
		 System.out.println(" Data type-ul obiectului meu  : " + text.getClass());

	 }*/
	
	
}
