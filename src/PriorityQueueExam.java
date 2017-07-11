import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExam {
    public static void main(String[] args){

        Queue pq = new PriorityQueue();

        pq.offer(7);
        pq.offer(3);
        pq.offer(14);
        pq.offer(10);
        pq.offer(6);

        System.out.println(pq);

        Object ob = null;
        while ((ob = pq.poll()) != null){
            System.out.println(ob);
        }

    }
}
