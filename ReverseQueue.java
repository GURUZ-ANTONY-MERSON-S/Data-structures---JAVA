import java.util.*;
class ReverseQueue{
    public static void main(String[] argw){
        Queue<Integer> queue=new LinkedList<>();
        Stack <Integer> stack = new Stack<>();
        
        queue.offer(1);
        queue.offer(2);
        queue.offer(4);
        queue.offer(8);
        
        while(! queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }
        
        System.out.println(queue);
    }
}