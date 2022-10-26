/*
Program: to print the attendance of the student
@Auther: K Mohan
@Date: 26oct22
*/

//declaring package
package com.ques1;

//importing scanner class
import java.util.Scanner;

//declaring a class
public class PrintingAttendance {
	
	  //main method
    public static void main(String[] args) {

        //creating object of scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of classes held ");
        //taking input from user
        float num1=sc.nextFloat();
        
      
        System.out.println("Enter te number of classes attended");
        //taking input from user
        float num2=sc.nextFloat();

        //calling the method
        AttendanceCalculator.checkAttendance(num1, num2);
    }
    //end of main

}
//end of class
