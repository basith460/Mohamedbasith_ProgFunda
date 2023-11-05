package com.gradedProject.q2;
import java.util.Scanner;

public class CalculateBasepower {
	public static int calculatePowerValue(int x,int n) {
		if(n!=0) {
			return x*calculatePowerValue(x,n-1);
		}
		return 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//getting user inputs
		System.out.println("Enter base value:");
		int base=sc.nextInt();
		System.out.println("Enter power value:");
		int power=sc.nextInt();
		//calling recursion function
		int result=calculatePowerValue(base,power);
		System.out.println("The value of base^power is:"+result);
		sc.close();
	}

}
