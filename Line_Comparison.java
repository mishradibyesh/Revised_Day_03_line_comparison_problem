package com.bl.linecomparison;
import java.lang.*;
import java.util.Scanner;
public class Line_Comparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		// making object of Scanner class
		System.out.println("enter the co-ordinates for first line");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first co-ordinate");
		// taking two inputs from user as point co ordinates
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		System.out.println("enter the second co-ordinate");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		//printing the co-ordinates in well defined manner
		System.out.println("the first co-ordinate is (" +x1 +","+y1+") ");
		System.out.println("the second co-ordinate is (" +x2 +","+y2+") ");
		double length1;
		double length2;
		//finding the squares
		int point1=(x2-x1)*(x2-x1);
		int point2=(y2-y1)*(y2-y1);
		// finding the square root 
		length1=Math.sqrt(point1+point2);

		//code for second line
		System.out.println("enter the co ordinates for second line");
		System.out.println("enter the first co-ordinate");
		int m1=sc.nextInt();
		int n1=sc.nextInt();
		System.out.println("enter the second co-ordinate");
		int m2=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("the first co-ordinate is (" +m1 +","+n1+") ");
		System.out.println("the second co-ordinate is (" +m2 +","+n2+") ");
		int point3=(m2-m1)*(m2-m1);
		int point4=(n2-n1)*(n2-n1);
		length2=Math.sqrt(point3+point4);
		// printing the length of the lines
		System.out.println("length of the line is "+length1);
		System.out.println("length of the second line is "+length2);
		// using wrapper class concept
		Double length1new= length1;
		Double length2new= length2;

		boolean chk=length1new.equals(length2new);    // checking eqality using equals method
		if(chk==true)                                       
			System.out.println("these two lines are equal");
		else
			System.out.println("these two lines are NOT equal");

	}
}
