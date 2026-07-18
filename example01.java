package com.nt.leetcode;

public class example01 {
	
	public static void main(String[] args) {
		
		int num = 153;
		int temp = num ;
		int count = 0;
		int rev ;
		int sum =0 ;
		
		while(temp > 0) {
			count += 1;
			
			temp /= 10 ;
		}
		
		temp = num ;
		
		while(temp > 0) {
			rev = temp %10;
			//System.out.println(rev);
			sum += Math.pow(rev,count);
			temp = temp /10;
		}
		
		if(sum == num) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		//System.out.println(sum);
	}
	
}
