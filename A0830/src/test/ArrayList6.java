package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList6 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		numbers.removeIf(n->(n%3)==0);	//java8 버전부터 추가된 람다식
		System.out.println(numbers);
	}

}
