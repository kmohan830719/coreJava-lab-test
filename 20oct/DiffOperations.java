//Program: to do square cube and check oddEven
//@Auther: K Mohan
//@Date:19oct22

// importing package
import java.util.*;

//declaring class
 class DiffOperations{
	 //mainmethod
    public static void main(String[] args) {
		
		//creating object of scanner class
        Scanner sc=new Scanner(System.in);
		
		//taking user input
        System.out.println("Enter the number");
        float num=sc.nextFloat();
        System.out.println("choose what to do");
        System.out.println("1.square");
        System.out.println("2.cube");
        System.out.println("3.even/odd");

        System.out.println("Enter your choice");
        int choice=sc.nextInt();
       
	   //switch case
        switch (choice){
            case 1: square(num);   //calling method
                break;
            case 2: cube(num);
                break;
            case 3: oddEven(num);
                break;
        }
    }
	//end of main
	
	//method to do square
    static void square(float n1){
        float sq=(n1*n1);
        System.out.println("The square of the number is: "+sq);
    }
	//end of method square
	
	//method to do cube
    static void cube(float n1){
        float cu=(n1*n1*n1);
        System.out.println("The square of the number is: "+cu);
    }
	//end of method cube
	
	//method to check odd/even
    static void oddEven(float n1){
       if((n1%2)==0){
           System.out.println("It is a even number");
       }
       else{
           System.out.println("It is a odd number");
       }
    }
	//end of method oddEven
}
//end of class DiffOperators
