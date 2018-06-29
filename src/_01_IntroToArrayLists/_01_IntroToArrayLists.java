package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> array = new ArrayList<String>();
		//2. Add five Strings to your list
		array.add("a");
		array.add("b");
		array.add("c");
		array.add("d");
		array.add("e");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i));
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String s: array) {
			System.out.print(s);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < array.size(); i++) {
			if(i % 2 == 0) {
				System.out.print(array.get(i));
			}
		}
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		for(int i = array.size(); i > 0; i--) {
			System.out.print(array.get(i));
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < array.size(); i++) {
			
		}
	}
}
