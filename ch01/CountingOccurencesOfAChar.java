package ch01;

import java.util.*;
public class CountingOccurencesOfAChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		
		System.out.println("Enter the char you want to find: ");
		char c = sc.next().charAt(0);
		sc.close();
		int occurences=0;
		for(char i: s.toCharArray()) {
			if(c==i) {
				occurences++;
			}
			
		}
		System.out.println("occurences :"+occurences);

	}

}
