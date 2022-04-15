package ch01;

import java.util.*;

public class StringWithDigitsOnly {
	public static void main(String[] args) {
		String s;
		//String n="0123456789";
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		sc.close();
		int flag=0;
		for(char i:s.toCharArray()) {
			if(!(Character.isDigit(i))) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Only Digits  exist");
		}
		else if(flag==1) {
			System.out.println("char exists");
		}
		
		
	}

}
