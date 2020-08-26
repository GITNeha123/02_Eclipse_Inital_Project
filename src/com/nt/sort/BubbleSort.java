package com.nt.sort;

public class BubbleSort {
	public static void bubbleSort(int a[]) {
int a=30;
		for (int i=0;i<a.length-1 ;i++ )
		{
		for (int j=i+1;j<a.length;j++ ){
			if(a[i]>a[j])
			{					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
	}

	public  void m2() {
		// TODO Auto-generated method stub HS-134
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {5,8,1,2,3,1};
bubbleSort(a);
for(int i:a) {
	System.out.println(i);
}
/*for(int i=1; i<=a.length;i++){
	System.out.println(a[i]);
	
}*/
	}

}
