package ex11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Ex2_3_4 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		HashSet set = new HashSet(list); //2,3,6,7
		TreeSet tset = new TreeSet(set); 
		Stack stack = new Stack();
		
		stack.addAll(tset); //2 ,3 , 6 , 7 
		
		while(!stack.empty())
		System.out.println(stack.pop()); // 7 6 3 2
		}
	
	//Ex2 - 7,6,3,2
	//Ex3 - a
	//Ex4 - 6
}
