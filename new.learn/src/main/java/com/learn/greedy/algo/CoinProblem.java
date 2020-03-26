package com.learn.greedy.algo;

import java.util.ArrayList;
import java.util.List;

public class CoinProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = minCoins(70, 70);
		System.out.println("value is " + value);
		System.out.println(minCoinsDenomination(45,90));
	}
	
	
	public static int minCoins(int n,int s) {
		int res = 0;
		int temp =s;
		while(temp>0) {
			
			if(n<=temp) {
				res = res+1;
				temp = temp - n;				
			}
			n--;
		}
		return res;
	}
	
	public static List<Integer> minCoinsDenomination(int n,int s) {
		List<Integer> res = new ArrayList<Integer>();
		int temp =s;
		while(temp>0) {
			
			if(n<=temp) {
				res.add(n);
				temp = temp - n;				
			}
			n--;
		}
		return res;
	}

}
