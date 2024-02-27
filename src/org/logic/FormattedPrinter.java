package org.logic;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FormattedPrinter {
	private int printCalled = 0;
	public void print(int id) {
		String formatted = "Id Value is :" + id;
		printCalled++;
		System.out.println(formatted);
	}

	public void print(int a, int b) {
		printCalled++;
		System.out.println("Values of two :" + a + " " + b);
	}

	public <T> void print(ArrayList<T> li) {
		printCalled++;
		System.out.println(li);
	}

	public void print(Map<String, String> map) {
		printCalled++;
		System.out.println(map);
	}

	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(11);
		i.add(12);
		i.add(13);
		
		ArrayList<String> strArr = new ArrayList<>();
		
		strArr.add("Asd");

		Map<String, String> map = new LinkedHashMap<>();
		map.put("Abi", "Lee");
		map.put("Vee", "Abi");
		map.put("Na", "hash");
//		map.put("N", 123);

		FormattedPrinter printer = new FormattedPrinter();
		printer.print(100);
		printer.print(10, 20);
		printer.print(i);
		printer.print(map);
		printer.print(123);

		System.out.println(printer.printCalled);
	}
}
