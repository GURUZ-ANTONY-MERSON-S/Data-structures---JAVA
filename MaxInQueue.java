import java.util.LinkedList;
import java.util.Queue;

class MaxInQueue {
	public static void main(String[] argw) {
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(71);
		queue.offer(28);
		queue.offer(40);
		queue.offer(88);
		queue.offer(90);
		queue.offer(76);

		int max=Integer.MIN_VALUE;
		for(Integer x: queue) {
			if(max<x) {
				max=x;
			}
		}
		System.out.println(max);
	}
}