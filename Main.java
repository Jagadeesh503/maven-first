package com.codebind;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello WOrld");
		Gift g=new Gift(3,4);
		Gift g1=new Gift(1,4);
		Gift g2=new Gift(2,6);
		Gift g3=new Gift(3,9);
		int x[]=new int[4];
		x[0]=g.totalWeight();
		x[1]=g1.totalWeight();
		x[2]=g2.totalWeight();
		x[3]=g3.totalWeight();
		Arrays.parallelSort(x);
		for(int i=0;i<4;i++)
		{
			System.out.println(x[i]);
		}

	}

}
