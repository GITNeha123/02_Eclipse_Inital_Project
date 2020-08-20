package com.nt.sort;

public class sorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {67,90,45,34,98,23};
		int min=0,temp;
		System.out.println("before sorting");
		for(int i=1;i<a.length; i++){
			System.out.print(a[i]+", ");
			}
		System.out.println();
		for(int i=1; i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length; j++) {
				if(a[j]<a[min])
				{
					min=j;
				}
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		
		System.out.println("after sorting");
		for(int i=1;i<a.length; i++){
			System.out.print(a[i]+", ");
			}
		
		System.out.println("Good Days");
		System.out.println("Good Morning");
		
		}
}
