import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();

        
        queue.add(" 1");
        queue.offer(" 2");
        queue.add(" 3");
        queue.offer(" 4");

        
        System.out.println("Element in Queue: " + queue);

        
        String firstElementUsingPeek = queue.peek(); 
        String firstElementUsingPoll = queue.poll(); 

        System.out.println("First element in the first way: " + firstElementUsingPeek);
        System.out.println("First element in the second way: " + firstElementUsingPoll);
        
        
        System.out.println("Element in Queue after deletion: " + queue);
    }
}
