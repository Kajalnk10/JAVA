package com.array.test;

public class tester {
	
	public static void removeDuplicate(int[]input) {
		
	int i = 0;
	int j = 1;
	while(j<input.length) {
		
		if(input[i] !=input[j]) {
		    i++;
		    input[i] = input[j];
		    
		}
		
		
		j++;
	}
	
}
	
	public static void main(String[] args) {
		
		removeDuplicate(new int [] { 1,1,1,1,2,3,4,5,6});
	}

}
