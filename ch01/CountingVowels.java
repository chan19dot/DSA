package ch01;

import java.util.*;

public class CountingVowels {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		//char[] v = {'a','e','i','o','u'};
		sc.close();
		Set vowel=new HashSet();
		//vowel.addAll(Arrays.asList(new char[] {'a','e','i','o','u'}));
		
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');
		s=s.toLowerCase();
		int countOfVowels=0;
		for(char i: s.toCharArray()) {
			if(vowel.contains(i)) {
				countOfVowels++;				
			}
		}
		System.out.printf("No. of vowels in the given string are : %d",countOfVowels);
		//System.out.print(vowel.contains('a'));
	}

}
