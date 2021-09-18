package com.example.demo;


public class UserImpl {
	public static void main(String[] args) {
		System.out.println("Welcome to Online IDE!! Happy Coding :)");
		int[] m= new int[]{1,6,8,5,9,4,7,2};
		int[] n = new int[5];
		int result;
		for(int i=0;i<=3;i++){
			if (i==0){
				n[0] = m[0];
				
			}
			else if (i==1){
				result=m[1]+m[2];
				n[1] = result;
			}
			else if(i==2){
				result=m[3]+m[4]+m[5];
				n[2] = result;
				
			}
			else if(i==3){
				result=m[6]+m[7];
				n[3] = result;
			}
		};
		for (int i=0; i<=n.length;i++){
			System.out.println(n[i]);
		}
	}
}