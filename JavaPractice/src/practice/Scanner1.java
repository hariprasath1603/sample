package practice;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Name, Age, Salary");
		
		String name = sc.nextLine();
		int num = sc.nextInt();
		double sal = sc.nextDouble();
		System.out.println("Name ;"+name);
		System.out.println("Age; "+num);;
		System.out.println("sal; "+sal);
		
	}

}
