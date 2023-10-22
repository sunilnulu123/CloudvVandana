package com.cloudvandana.one;

import java.util.Scanner;


public class RomanConversion {
	
	public int value(char ch) {
		if(ch=='I') {
			return 1;
		}
		else if(ch=='V') {
			return 5;
		}
		else if(ch=='X') {
			return 10;
		}
		else if(ch=='L') {
			return 50;
		}
		else if(ch=='C') {
			return 100;
		}
		else if(ch=='D') {
			return 500;
		}
		else if(ch=='M') {
			return 1000;
		}
		return 0;
	}
	
	public int convertRomanToNum(String s) {
		
		
		int total=0;
		
		for(int i=0;i<s.length();i++) {
			int a=value(s.charAt(i));
			if(i+1 <s.length()) {
				int b=value(s.charAt(i+1));
				if(a<b) {
					total -=a;
				}
				else {
					total+=a;
				}
			}
			else {
				total+=a;
			}
		}
		return total;
		
	}
	
	
	public static void main(String[] args) {
		RomanConversion r=new RomanConversion();
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		boolean isRoman=true;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)=='I')||(s.charAt(i)=='V')||(s.charAt(i)=='X')||(s.charAt(i)=='L')||(s.charAt(i)=='C')||(s.charAt(i)=='D')||(s.charAt(i)=='M')) {
				continue;
			}
			else {
				isRoman=false;
			}
		}
		if(isRoman) {
			System.out.println(r.convertRomanToNum(s));
		}
		else {
			System.out.println("Wrong Input");
		}

	}

}
