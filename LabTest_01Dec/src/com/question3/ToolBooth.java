//decalaring the package
package com.question3;

//decalring the class
public class ToolBooth extends Thread {

	// main method
	public static void main(String[] args) {
		// ceating the threads
		Thread A = new Thread();
		Thread B = new Thread();
		Thread C = new Thread();
		Thread D = new Thread();
		Thread E = new Thread();

		// starting thread A
		A.start();
		// try block
		try {
			A.sleep(300);   //sleep time of 3oo millisec
			System.out.println("Vehicle 1");
            System.out.println("----------------------");
			System.out.println("Start the journey");
			A.sleep(400);
			System.out.println("Arrived at toll");
			A.sleep(300);
			System.out.println("Entered the toll booth");
			A.sleep(300);
			System.out.println("Exited the toll booth");
			System.out.println("Cross the Bridge");
			A.sleep(2000);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		//Starting thread B
		B.start();
		//try block
		try {
			B.sleep(2000);
			System.out.println("Vehicle 2");
            System.out.println("----------------------");
			System.out.println("Start the journey");
			B.sleep(2000);
			System.out.println("Arrived at toll");
			B.sleep(2000);
			System.out.println("Entered the toll booth");
			B.sleep(2000);
			System.out.println("Exited the toll booth");
			System.out.println("Cross the Bridge");
			B.sleep(2000);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//satrting thread C
		C.start();
		//try block
		try {
			C.sleep(2000);
			System.out.println("Vehicle 3");
			 System.out.println("----------------------");
			System.out.println("Start the journey");
			C.sleep(2000);
			System.out.println("Arrived at toll");
			C.sleep(2000);
			System.out.println("Entered the toll booth");
			C.sleep(2000);
			System.out.println("Exited the toll booth");
			System.out.println("Cross the Bridge");
			C.sleep(2000);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//starting thread D 
		D.start();
		try {
			D.sleep(3000);
			System.out.println("Vehicle 4");
			 System.out.println("----------------------");
			System.out.println("Start the journey");
			D.sleep(3000);
			System.out.println("Arrived at toll");
			D.sleep(3000);
			System.out.println("Entered the tollbooth");
			D.sleep(3000);
			System.out.println("Exited the tollbooth");
			System.out.println("Cross the Bridge");
			D.sleep(3000);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//starting thread E
		E.start();
		try {
			E.sleep(4000);
			System.out.println("Vehicle 5");
			 System.out.println("----------------------");
			System.out.println("Start the journey");
			E.sleep(4000);
			System.out.println("Arrived at toll");
			E.sleep(4000);
			System.out.println("Entered the tollbooth");
			E.sleep(4000);
			System.out.println("Exited the tollbooth");
			System.out.println("Cross the Bridge");
			E.sleep(4000);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}