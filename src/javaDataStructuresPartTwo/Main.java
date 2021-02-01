package javaDataStructuresPartTwo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> addNumbers = new ArrayList<>();// create ArrayList
		
		addNumbers.add(1);// add integers to the ArrayList
		addNumbers.add(5);
		addNumbers.add(9);
		addNumbers.add(10);
		addNumbers.add(20);
		
		
		
		
		double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

             if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ];

                  index = i;

             }

        }

        System.out.println(index);

	}

}
