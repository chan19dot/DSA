package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;



public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dvdf";
		int len=0;
		HashMap<Character,Integer> m = new HashMap<>();
		ArrayList<Integer> l = new ArrayList<>();
		//int a[] = new int[10];
		
		for(char c: s.toCharArray()) {
			System.out.println(m);
			if(m.containsKey(c)) {
				//m.clear();
				m.remove(c);
				l.add(len);
				len=1;
				System.out.printf("Char is %c\n",c);
				m.put(c,1);
				} 
			else {
				m.put(c,1);
				len++;
				System.out.printf("Char is %c in else\n",c);
				}
			}
		l.add(len);
		Collections.sort(l);
		System.out.print(l.get(l.size()-1));
		}
		
		
		

	}


