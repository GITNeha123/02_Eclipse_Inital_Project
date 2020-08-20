package com.nt.sort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,1,6,2,4,3};
		int temp=0,j=0;
		System.out.println("Before Sorting ....");
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println(" ");
		for(int i=1; i<a.length; i++) {
			temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp) {
				
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
System.out.println("After Sorting ....");
		for(int x:a) {
			System.out.print(x+" ");
		}
	}

}
