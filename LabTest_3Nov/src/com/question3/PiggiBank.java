/*
 * piggi bank to add money
 * @Auther: K MOhan
 * @Date: 03nov22
 */

//declaring the package
package com.question3;

//decalaring the class
public class PiggiBank {
	
	//private variables
	private float amount=500;
	
	//default constructor
	public PiggiBank() {
		
	}
	
	//parameterised constructor
	public PiggiBank(float amt) {
		this.amount=amt;
	}
	
	//method to add money
	public float addMoney(float mny) {
		amount+=mny;
		return(amount);
	}
	
    //getter for the amount
	public float getAmount() {
		return amount;
	}


	
}
//end of the class
