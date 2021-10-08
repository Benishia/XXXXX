package org.stu;

import java.util.Scanner;

public class Student {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Student Name:");
	 	String studentName = obj.nextLine();
	    System.out.println("Student Name:"+ studentName);
		System.out.println("Enter Student Id: ");
		byte studentId=obj.nextByte();
		System.out.println("Student Id:"+studentId);
		
 		System.out.println("Enter Mark1:");
 		byte mark1=obj.nextByte();
 		System.out.println("Mark1:"+mark1);
 		
 		System.out.println("Enter Mark2");
 		byte mark2=obj.nextByte();
 		System.out.println("Mark2:"+mark2);
 		
 		System.out.println("Enter Mark3:");
 		byte mark3=obj.nextByte();
 		System.out.println("Mark3:"+mark3);
 		
 		System.out.println("Enter Mark4:");
 		byte mark4=obj.nextByte();
 		System.out.println("Mark4:"+mark4);
 		
 		System.out.println("Enter Mark5:");
 		byte mark5=obj.nextByte();
 		System.out.println("Mark5:"+mark5);
 		
 		int Total=mark1+mark2+mark3+mark4+mark5;
 		System.out.println("Total Mark:"+Total);
 		float Average=Total/5;
 		System.out.println("Average of Marks"+Average);
	  
 		System.out.println("Enter Mark6:");
 		byte mark6=obj.nextByte();
 		System.out.println("Mark6:"+mark6);
 		
 		
 		
	   obj.close();
					
	}

}
