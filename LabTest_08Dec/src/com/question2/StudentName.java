package com.question2;

//importing the package
import java.util.*; 

//declaring the class
public class StudentName {

	//main method
 public static void main(String args[]){ 
	 
	 //map for student with unique id
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(1,"Mohan");  
  map.put(2,"Sohan");  
  map.put(3,"Rohan"); 
  map.put(4,"Rahul");  
  map.put(5,"Ravi");
  
  //printing the details
  System.out.println("The students with unique id");
  
  //Elements can traverse in any order  
  for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
   
   
  }  
 }  
} 