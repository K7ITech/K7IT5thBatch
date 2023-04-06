package com.k7it.ArraysDimentions;

public class LeftDiagnols {

	public static void main(String[] args) {
		int ar[][] =  new int[4][4];
        int v =1;
        for(int i=0;i<4;i++) {
       	 for(int j =0;j<4;j++) {
       		 ar[i][j] = v++;
       	 }
        }
        
        for(int i=0;i<4;i++) {
       	 
       	 for(int j =0;j<4;j++) {
       		 if(i == j) {
       			 System.out.print(ar[i][j]+"\t");
       		 }else {
       			 System.out.print("*"+"\t");
       		 }
       	 }
       	 System.out.print("\n");
        }
	}

}
