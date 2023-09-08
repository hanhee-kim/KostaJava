package test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> qu = new LinkedList<>();
		qu.add(100);	//enqueue (데이타를 넣는 것 : 엔큐 )
		qu.offer(200); 	//enqueue
		qu.poll();	//data삭제 , 차례대로 값을 가져옴		//dequeue
		qu.remove(); //dequeue data delete. 값가져옴
		qu.clear(); //초기화(리셋)시킴
		
		
		
	}

}
