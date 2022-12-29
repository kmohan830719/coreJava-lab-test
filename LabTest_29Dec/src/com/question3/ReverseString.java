/*
Program: to reverse the string without using string builder and buffer
@Auther: K Mohan
@Date: 29Dec22
*/

//declaring package
package com.question3;

//importing the package
import java.util.Scanner;

//declaring the class
public class ReverseString {

	//method to reverse the string
	public static String reverse(String source){
		
		//checking whether the string is null 
        if(source == null || source.isEmpty()){
            return source;
        }  
        //logic to reverse the string
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
     
        //returning the reversed string
        return reverse;
    }
	//end of the method
	
	//main method
	public static void main(String[] args) {
		 
		//creating the object of scanner class
		Scanner sc= new Scanner(System.in);
		
		//taking the user input
		System.out.println("Enter the String");
		
		String s=sc.next();
		
		//calling the method to reverse the string
		System.out.println("The reverse string is: "+reverse(s));
		
		sc.close();
	}
    //end of main method
}
//end of the class