import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

    /** Initialize your data structure here. */
    Queue<Integer> queue;
    int size;
    int sum;
    public MovingAverage(int size) {
        queue = new LinkedList<>();
        this.size = size;
        sum = 0;
    }
    
    public double next(int val) {
        int prev = 0;
        double result = 0;
        if(queue.size() == size){
            prev = queue.poll();
            sum = sum - prev;
            queue.add(val);
            sum = sum + val;
        }
        else {
            queue.add(val);
            sum = sum + val;
        }
        
        return queue.size() == 0 ? 0 : (double)sum/(double)queue.size();
    }
}
