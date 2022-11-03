/*
 * hotel booking
 * @Auther: K MOhan
 * @Date: 03nov22
 */

//declaring the package
package com.question2;

//declaring the class
public class Hotel {
	
	//private variables
	private int roomNum;
	private String roomType;
	private String acFacility;
	private String roomArea;
	private float roomPrice;
	
	
	//default constructor
	public Hotel() {
		
	}
	
	//parameterised constructor
	public Hotel(String roomtype,float roomPrice) {
		this.roomType=roomtype;
		this.roomPrice=roomPrice;
	}
	
	//prameterised constructor for all fields
	public Hotel(int num,String type,String ac,String area,float price) {
		this.roomNum=num;
		this.roomType=type;
		this.acFacility=ac;
		this.roomArea=area;
		this.roomPrice=price;
	}

	//getter for room price
	public float getRoomPrice() {
		return roomPrice;
	}

	//setter for room price
	public void setRoomPrice(float roomPrice) {
		this.roomPrice = roomPrice;
	}
	
	//setter for room price
	public void setRoomPrice(float Price,float dis) {
		
		this.roomPrice =((100-dis)/100)*roomPrice;
	}
	
	//getter for room number
	public float getRoomNUm() {
		return roomNum;
		}
	
	//getter for room facility
	public String getRoomFacility() {
		return acFacility;
		}
		
	//getter for room area
     public String getRoomArea() {
		return  roomArea;
		}
		
    //method to print details
	public void printStanderd() {
		System.out.println("Room type is: "+roomType);
		System.out.println("Room price type is: "+roomPrice);
	}
	
	

}
//end of the class
