//Program: to compare age of three persons
//@Auther: K Mohan
//@Date:19oct22

// importing package
import java.util.*;

//declaring class
 class ComparingAge {
	 //main method
    public static void main(String[] args) {
		
		//creating object of scanner class
        Scanner sc=new Scanner(System.in);
		//taking user input
        System.out.println("Enter age of person1");
        float person1=sc.nextFloat();
        System.out.println("Enter age of person2");
        float person2=sc.nextFloat();
        System.out.println("Enter age of person3");
        float person3=sc.nextFloat();

        //calling the methods
        younger(person1, person2,person3);
        greater(person1,person2,person3);

    }
	//end of main
	
	//method to compare age
    static void younger(float n1, float n2, float n3){
		//comparing age
        if((n1<n2) && (n1<n3)){
            System.out.println("The younger member among the three is: "+n1);
        }
        else if(n2<n3){
            System.out.println("The younger member among the three is: "+n2);
        }
        else{
            System.out.println("The younger member among the three is: "+n3);
        }
    }
	//end of method younger
	
	//method to compare age
    static void greater(float n1, float n2, float n3){
		//comparing age
        if((n1>n2) && (n1>n3)){
            System.out.println("The elder member among the three is: "+n1);
        }
        else if(n2>n3){
            System.out.println("The elder member among the three is: "+n2);
        }
        else{
            System.out.println("The elder member among the three is: "+n3);
        }
    }
	//end of method greater
}
//end if class ComparingAge