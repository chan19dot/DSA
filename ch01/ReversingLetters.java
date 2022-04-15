package ch01;
import java.util.*;

public class ReversingLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s= sc.nextLine();
		sc.close();
		for(int i = s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}

	}

}
