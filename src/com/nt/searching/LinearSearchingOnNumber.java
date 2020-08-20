package com.nt.searching;

import java.util.Scanner;

public class LinearSearchingOnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		Scanner sc=new Scanner(System.in);
		int arr[]= {20,30,60,-1,80};
		System.out.println("Enter your Number");
		int name=sc.nextInt();
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==name) {
				System.out.println("Item found in "+i+" Position");
				temp=temp+1;
			}
			
		}
		if(temp==0)
			System.out.println("Item does not found ");
		

	}

}
