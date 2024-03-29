package com.codekata.practice.javastream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Stream filter practice.
 */
public class StreamFilterPractice {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("3");
		arrayList.add("1");
		arrayList.add("3");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("5");
		
		List<String> newArray = arrayList.stream().filter(f -> f.equals("3")).collect(Collectors.toList());
		
		System.out.println(newArray);
	}

}
