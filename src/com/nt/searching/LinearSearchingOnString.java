package com.nt.searching;

import java.util.Scanner;

public class LinearSearchingOnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		Scanner sc=new Scanner(System.in);
		String str[]= {"ne","param","harshita","amit","sheveta"};
		System.out.println("Enter your String");
		String name=sc.next();
		for(int i=0; i<str.length;i++) {
			if(str[i].equals(name)) {
				System.out.println("Item found in "+i+" Position");
				temp=temp+1;
			}
			
		}
		if(temp==0)
			System.out.println("Item does not found ");
		

	}

}
