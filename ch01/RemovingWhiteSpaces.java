package ch01;

import java.util.*;

public class RemovingWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		s=s.replace(" ", "");//.replaceAll("\\s","")\\s->unicodeCharacterForSpace;
		System.out.println(s);

	}

}
