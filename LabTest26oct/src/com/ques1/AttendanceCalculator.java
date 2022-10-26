/*
Program: to check the attendance of the student
@Auther: K Mohan
@Date: 26oct22
*/

//declaring package
package com.ques1;

//declaring the class
class AttendanceCalculator{

    //method to give grace marks
    public static void checkAttendance(float n1 ,float n2){
    	
        float percentage=(n2/n1)*100;
         
        //checking attendance
        if(percentage>=75){          
            System.out.println("your attendance is: "+percentage+"%");
            System.out.println("you are allowed to sit in the exam");
        }
        else {
        	System.out.println("your attendance is: "+percentage+"%");
            System.out.println("you are not allowed to sit in the exam");
        }
        //end of if
    }
    //end of method checkAttemdance
}
//end of class AttendanceCalculator