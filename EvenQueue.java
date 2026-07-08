import java.util.LinkedList;
import java.util.Queue;

//Count for the even numbers present in the queue
class EvenQueue {
	public static void main(String[] argw) {
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(71);
		queue.offer(28);
		queue.offer(40);
		queue.offer(88);
		queue.offer(90);
		queue.offer(76);

		Integer count = 0;
		
		for(Integer x : queue){
		    if(x%2 == 0){
		        count++;
		    }
		}
		System.out.println(count);
	    
	}
}