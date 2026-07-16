package com.nt.leetcode;

public class fibinnacis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n = 10;
      
      int f1 = 0 ;
      int f2 = 1;
      System.out.print(f1 + " ");
      System.out.print(f2 + " ");
      int f3;
      
      for(int i = 2 ; i < n ; i++) {
    	  f3 = f1 + f2;
    	  f1 = f2;
    	  f2 = f3;
    	  
          System.out.print(f3 + " " );
          
      }
	}

}
