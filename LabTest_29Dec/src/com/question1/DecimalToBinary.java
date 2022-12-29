/*
Program: to convert decimal number into binary
@Auther: K Mohan
@Date: 29Dec22
*/

//declaring package
package com.question1;

//importing the package
import java.util.Scanner;

//declaring the class
public class DecimalToBinary {

	   //method to convert decimal to binary
    static void decimalToBinary(int n)
    {
        //array to store binary number
        int[] binaryNum = new int[1000];
   
        int i = 0;
        while (n > 0) 
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
   
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
      
    //main method
    public static void main (String[] args) 
    {
    	//creating the object of scanner class
    	Scanner sc = new Scanner(System.in);
    	
    	//taking the user input
    	System.out.println("Enter the number");
        int n = sc.nextInt();
        
        System.out.print("The binary number is: ");
        
        //calling the meyhod to print binary number
          decimalToBinary(n);
          
          sc.close();
    }
    //end of main method
    
}
//end of the class

