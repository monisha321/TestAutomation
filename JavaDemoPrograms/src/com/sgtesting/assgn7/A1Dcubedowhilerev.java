package com.sgtesting.assgn7;

import java.util.Scanner;

public class A1Dcubedowhilerev {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array");
		int b=s.nextInt();
		int i=1;
		do
		{
			System.out.println(i*i*i);
			i=i+1;
		}while(i<=b);
		System.out.println();

		int a[]=new int[b];
		int k=0;
		int j=1;
		do
		{
			a[k]=j*j*j;
			k=k+1;
			j=j+1;
		}while(j<=b);

		int z=(a.length-1);
		do
		{
			System.out.println(a[z]);
			z=z-1;
		}while(z>=0);
		s.close();

	}

}
