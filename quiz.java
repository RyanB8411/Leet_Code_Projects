import java.util.Arrays;
import java.util.PriorityQueue;

public class quiz {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue =
      new PriorityQueue<Integer>(
        Arrays.asList(60, 10, 50, 30, 40, 20));
    
    while (!queue.isEmpty())
      System.out.print(queue.poll() + " ");
    }
}
