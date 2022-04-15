package leetCode;

import java.util.HashMap;

public class LongestSubstringUsingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bbbbb"; //test cases include "dvdf",""abcabcbb","aab","bbbbb","pwwkew"
		HashMap<Character,Integer> m = new HashMap<>();
		for (char c: s.toCharArray()) {
			m.put(c, 1);
		}
		int window = m.size();
		m.clear();
		int flag=1;
		while(flag==1) {
			int i=0;
			while((window+i<s.length()) && (window>0)){
				m.clear();
				String panel = s.substring(i, window+i);
				System.out.printf("Panel is %s \n",panel);
				for(char c: panel.toCharArray()) {
					m.put(c, 1);
				}
				if(m.size()==window) {
					System.out.println(m.size());
					flag=0;
					System.out.println("break");
					break;
				}
				else {
					i++;
				}
			}
			if(flag==1) {
				System.out.printf("Window Decremented by one %d",window);
				window--;
			}
		}
		System.out.println(window);
		

	}

}
