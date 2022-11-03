/*
 * hotel booking facility
 * @Auther: K MOhan
 * @Date: 03nov22
 */

//declaring the package
package com.question2;

//importing the package
import java.util.*;

//declaring the class
public class Booking {
	
	//method to show the menu
	static void menu() {
		
		//showing the nenu
		System.out.println("Select the Roon type");
		System.out.println("1. Standerd");
		System.out.println("2. Delux");
		System.out.println("3. Exit");
		System.out.println("Enter your choice");
		
	}
	//end of the method
	
	//main method
	public static void main(String[] args) {
		
		//creating the objects
		Hotel h1=new Hotel("standerd",1000);
		Hotel h2=new Hotel(1,"Delux","Ac","15sqm",2000 );
		
		//calling the menu
		menu();
		
		//creating the object of scanner class
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		int ch=0;
		
		//switch case
		switch(choice) {
		
		case 1: //calling method to print room standard
			    h1.printStanderd();
		        //taking user details
		        System.out.println("Do you have any discount (1-yes/2-no)");
		        ch=sc.nextInt();
		        //to check the choice of user(for discount)
		        if(ch==1) {
		        	System.out.println("Enter discount");
		        	float dis=sc.nextFloat();
		        	h1.setRoomPrice(choice, dis); //callling the method
		        	System.out.println("your discounted room price is: "+h1.getRoomPrice()+" Booked!!");
		         	System.out.println("your roomnumber is: "+h2.getRoomNUm());
		        	System.out.println("your room area is: "+h2.getRoomArea());
		        }else {
		        	System.out.println("your romm price is:"+h1.getRoomPrice()+" Booked!!");
		         	System.out.println("your roomnumber is: "+h2.getRoomNUm());
		        	System.out.println("your room area is: "+h2.getRoomArea());
		        }
		        //end of if statement
		        break;
		        
		case 2:
			//calling the method
			h2.printStanderd();
			//taking the user choice
		    System.out.println("Do you have any discount (1-yes/2-no)");
	        ch=sc.nextInt();
	        //if to check condition
	        if(ch==1) {
	        	//takin user input
	        	System.out.println("Enter discount");
	        	float dis=sc.nextFloat();
	        	h2.setRoomPrice(choice, dis);  //calling the method
	        	System.out.println("your discounted room price is: "+h2.getRoomPrice()+" Booked!!");
	        	System.out.println("your roomnumber is: "+h2.getRoomNUm());
	        	System.out.println("your room facility: "+h2.getRoomFacility());
	        	System.out.println("your room area is: "+h2.getRoomArea());
	        }else {
	        	//printing the details
	        	System.out.println("your romm price is:"+h2.getRoomPrice()+" Booked!!");
	        	System.out.println("your roomnumber is: "+h2.getRoomNUm());
	        	System.out.println("your room area is: "+h2.getRoomArea());
	        }
	        break;
	        
		case 3:System.exit(0);  //exit
	         break;
		
			default:System.out.println("Invalid input");
		}
		//end of switch case
		sc.close();
	}
	//end of main method

}
//end of the class
