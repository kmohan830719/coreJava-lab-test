/*
 * to print taglines of diff companies
 * @Author: K Mohan
 * @Date: 26oct22
 */

//declaring package
package com.ques3;

//declaring class
public class Taglines {
	
	
	
    //method to print taglines of the company    
    static void CompanyType(String inp){    
		//switch case
        switch (inp){
          case "NIKE" -> System.out.println("Because You're Worth It");
		  case "WIPRO"-> System.out.println("Spirit of wipro");
	      case "ACCENTURE"-> System.out.println("Ideate,innovate,change the world,repeat");
		  case "INFOSYS"-> System.out.println("Navigate your Next");
	      default ->  System.out.println("not a valid input");
        }
        //end of switch
   
    }
	  //end of method CompanyType
	
}
//end of class
