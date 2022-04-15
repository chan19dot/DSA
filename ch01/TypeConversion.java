package ch01;

import java.util.*;

public class TypeConversion {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		sc.close();
		int x = Integer.parseInt(s);
		float y = Float.parseFloat(s);
		double z = Double.parseDouble(s);
		System.out.println(x+" "+y+"  "+z);
		
		
	}
}
