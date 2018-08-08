package com.gc.lists;


public class AlgorithmLab {

	public static void main(String[] args) {

		
		//use array to find frequency
		int [] array = {1,2,3,2,2,4,5,5,7,8,4,4,1,0,10};
		int [] count = new int[array.length];
		int temp = 0 ;
		
		for (int i = 0; i < array.length; i++) {
			temp = array[i]; 
			count[temp]++; //count is stored as the location codes
//			System.out.println(i + ":"+count[temp]);
		}
		for (int j = 0; j<array.length; j++) {
			 if(count[j] != 0)
				 System.out.println(j+":"+count[j] );
				 
		}
		
		System.out.println();
	}
}