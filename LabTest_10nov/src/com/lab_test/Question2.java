/*
 * Write a program to find common elements of the 2 different arrays
 * @Auher: K Mohan
 * @Date: 10nov22
 */

//declaring thepackage
package com.lab_test;

//declaring the class
public class Question2 {

	//main method
	public static void main(String[] args) {
		
		//declaring and initializing the array
		int []array1= {1,3,4,5,6,6};
	
		//declaring and initializing the array
		int []array2= {4,3,5,12,7};
			
	
		System.out.println("The common elements are:");
		
		//condition to check the common elements of the 2 array
		for(int i=0; i<array1.length;i++) {
			for(int j=0; j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					System.out.println(array1[i]);
				}
			}
		}
}
}