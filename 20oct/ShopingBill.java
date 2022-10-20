//Program: to calculate shoping bill
//@Auther: K Mohan
//@Date:19oct22

// importing package
import java.util.*;

//declaring class
 class ShopingBill {
	 //main method
    public static void main(String[] args) {
		//creating object of scanner class
        Scanner sc=new Scanner (System.in);
		//taking input
        System.out.println("The available items to buy");
        System.out.println("1.Rice: 500/kg");
        System.out.println("2.Potato: 300/kg");
        System.out.println("3.Wheat: 200/kg");
        System.out.println("4.pulse: 400/kg");
         
		//taking the choice of user
        System.out.println("Enter what you want to buy");
        int choice=sc.nextInt();
        System.out.println("Enter the quantity ");
        int quantity=sc.nextInt();
        
		//switch case
        switch (choice){
            case 1: rice(quantity);
                break;
            case 2: potato(quantity);
                break;
            case 3: wheat(quantity);
                break;
            case 4: pulse(quantity);
                break;
            default:
                System.out.println("Invalid input");
        }

    }
	  //end of main
	  
	  //method to calculate price
    static void rice( int n1){
		//calculating bill
        int cal=(500*n1);
        System.out.println("The cost price is: "+cal);
        if(cal>=2000){
            float newbill=(90*cal)/100;
            System.out.println("The bill you have to pay is: "+newbill);
        }
        else{
            System.out.println("The toatl bill is: "+cal);
        }
    }
	//end of method rice
	
	 //method to calculate price
    static void potato( int n1){
		//calculating bill
        int cal=(300*n1);
        System.out.println("The bill with 10% off is: "+cal);
        if(cal>=2000){
            float newbill=(90*cal)/100;
            System.out.println("The bill with 10% off is: "+newbill);
        }
        else{
            System.out.println("The toatl bill is: "+cal);
        }
    }
	//end of method potato
	
	 //method to calculate price
    static void wheat( int n1){
		//calculating bill
        int cal=(200*n1);
        System.out.println("The cost price is: "+cal);
        if(cal>=2000){
            float newbill=(90*cal)/100;
            System.out.println("The bill with 10% off is: "+newbill);
        }
        else{
            System.out.println("The toatl bill is: "+cal);
        }
    }
	//end of method wheat
	
	 //method to calculate price
    static void pulse( int n1){
		//calculating bill
        int cal=(400*n1);
        System.out.println("The cost price is: "+cal);
        if(cal>=2000){
            float newbill=(90*cal)/100;
            System.out.println("The bill with 10% off is: "+newbill);
        }
        else{
            System.out.println("The toatl bill is: "+cal);
        }
    }
	//end of method pulse
}
//end of class ShoppingBill
