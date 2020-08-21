package com.nt.searching;

public class BinarySearchTree {

int a=15;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,7,9,12,14,16,17,19,20,24,28};
		int l=0,h=arr.length,m=0;
		int s=16;
		m=(l+h)/2;
		while(l<=h) {
			if(arr[m]==s) {
				System.out.println("item fount at "+m+"position");
				break;
			}
			else if(arr[m]<s) {
				l=m+1;
			}
			else {
				h=m-1;
			}
			m=(l+h)/2;
				}
		if(l>h) {
			System.out.println("item not found ");
		}

	}

}
