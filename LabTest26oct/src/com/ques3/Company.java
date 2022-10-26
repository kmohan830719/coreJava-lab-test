/*
 * to print taglines of diff companies
 * @Author: K Mohan
 * @Date: 26oct22
 */
//declaring package
package com.ques3;

//importing package
import java.util.*;

//declaring class
public class Company {
	
	 //main method
    public static void main(String[] args) {
		
		//creating object of scanner class
        Scanner sc=new Scanner (System.in);
		
		//taking input
	    System.out.println("Enter the company name");
        String companyName=sc.next().toUpperCase();
	   
	     //calling the method
        Taglines.CompanyType(companyName);
	}
	//end of amin method
}
//end of class Company