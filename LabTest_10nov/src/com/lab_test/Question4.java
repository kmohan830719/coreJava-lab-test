/*
 * WAP to do matrix multiplication
 * @Auher: K Mohan
 * @Date: 10nov22
 */

//declaring thepackage
package com.lab_test;

//declaring the class
public class Question4 {

	//main method
	public static void main(String[] args) {
		
		//creating matrix1
		int matrix1[][]= {{2,3,4},{1,5,6},{1,2,3}};
		
		//creating matrix2
		int matrix2[][]= {{1,3,5},{2,5,8},{1,2,3}};
		
		//declaring matrix3 to store he multiplication of two matrices
		int matrix3[][]=new int[3][3];
		
		//multiplying the two matrices
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				matrix3[i][j]=0;
			
			for(int k=0;k<3;k++) {
				matrix3[i][k]+=matrix1[i][k]*matrix2[k][j];
			}
		}
		}
		
		//printing the multiplication of two matrices
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
