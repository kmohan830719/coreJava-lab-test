//declaring the package
package com.question2;

//decalring the class
public class TraficSignal  extends Thread{

	//main method
	public static void main(String[] args) {
		
		//an infinite do while loop
		do {
		//creating threads
		Thread A = new Thread();
		Thread B = new Thread();
		Thread C = new Thread();
		//red light at the start
		
		System.out.println("Red Light ON");
		
		//atarting thread a
		A.start();
		
		//try block
		try {
			A.sleep(3000);
			System.out.println("Red Light OFF");
			System.out.println("Green light ON");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//starting thread b
		B.start();
		//try block
		try {
			B.sleep(5000);
			System.out.println("Green Light is OFF");
			System.out.println("Yello Light id ON");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//starting thread c
		C.start();
		try {
			C.sleep(2000);
			System.out.println("Red Light is ON");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		}while(true);

	}

}