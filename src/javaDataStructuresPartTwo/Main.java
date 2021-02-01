package javaDataStructuresPartTwo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Integer[] addNumbers = {1, 5, 9, 10, 20};// create the given Array
		
		int sumAddNumbers = 0;// sum the numbers of the Array
		for (int i : addNumbers)
			sumAddNumbers += i;
		
		System.out.printf("The sum of the numbers is %s\n", sumAddNumbers);// print the sum of the numbers in the Array to the console
		
		
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
        
        int size = 4;
        int power = 2;
        double[] sizePower = new double[]{0, 1, 2, 3};
        System.out.println(Arrays.toString(toPower(sizePower)));

	}
	
	public static double[] toPower (double sizePower[]){
	    for (int i = 0; i < sizePower.length; i++) {
	         sizePower[i] = Math.pow(sizePower[i], 2);
	    }
	    return sizePower;
		
	}

}
