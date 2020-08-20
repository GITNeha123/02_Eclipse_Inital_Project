package com.nt.sort;
public class MergeSort {
int arr[];
int tempArr[];
int len;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArr[]= {48,36,13,52,19,94,21};
		MergeSort m=new MergeSort();
		m.sort(inputArr);
		for(int i:inputArr) {
			System.out.println(i+" ");
		}
		}
	public  void sort(int arr[]) {
		this.arr=arr;
		this.len=arr.length;
		this.tempArr=new int[len];
		divideArray(0,len-1);
		}
	public  void divideArray(int l,int h) {
		if(l<h) {
		int m=l+(h-l)/2;
		divideArray(l,m);//left
		divideArray(m+1,h);//right
		mergeSort(l,m,h);
		}
	}
	public void mergeSort(int l,int m,int h) {
		for(int i=l; i<=h; i++) {
			tempArr[i]=arr[i];
		}
		int i=l;
		int j=m+1;
		int k=l;
		while(i<=m && j<=h) {
			if(tempArr[i]<=tempArr[j]) {
				arr[k]=tempArr[i];
				i++;
			}
			else {
				arr[k]=tempArr[j];
				j++;
			}
				k++;
		}
	}
}
