package com.cleiver.aula.java;
import java.util.ArrayList;
import java.util.Hashtable;

public class Arrays {

	public static void main(String[] args) {
		Hashtable<String, Number> hashTable = new Hashtable<>();
		hashTable.put("one", 1);
		hashTable.put("two", 2);
		hashTable.put("three", 3);
		hashTable.put("four", 4);
		System.out.printf("the value of key called 'one' is: %d\n", hashTable.get("one"));
		
		
		ArrayList<Integer> intArray = new ArrayList<>();
		for(int i = 20; i < 10; i--) {
			intArray.add(i);
		}
		// get by index
		System.out.println(intArray.get(0));
		System.out.println(intArray.clone());

	}

}
