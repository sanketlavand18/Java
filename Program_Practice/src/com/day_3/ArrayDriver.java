package com.day_3;

import java.util.Scanner;

public class ArrayDriver {

			public static void main(String[] args) {
				int[] a=new int[10];
				int[] b= {34,55,67,89};
				int[] summarr=Array.findDigitSums(b);
				for(int i=0;i<summarr.length;i++) {
					System.out.println("sum of digts of number  : "+b[i]+"---->"+summarr[i]);
				}
				
				Scanner sc=new Scanner(System.in);
				Array.acceptData(a);
				Array.displayData(a);
				System.out.print("enter number to search");
				int num=sc.nextInt();
				int pos =Array.searchData(a,num);
				if(pos!=-1) {
					System.out.print("number found at : "+pos);
				}else {
					System.out.print("number not found");
					
				}
				int s=Array.findSum(a);
				System.out.println("sum: "+s);
				int max=Array.findMax(a);
				int min=Array.findMin(a);
				int sumof2=max+min;
				System.out.println(sumof2);
				System.out.println("Max: "+max+" Min : "+min);
		       sc.close();
			}

}
