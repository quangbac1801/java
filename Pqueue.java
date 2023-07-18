import java.util.Iterator;
import java.util.PriorityQueue;


public class Pqueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();//dung luong mac dinh 11. dequeue mac dinh la 16
        queue.add("Ronaldo");
        queue.add("Messi");
        queue.add("Neymar");
        System.out.println("head:"+queue.element());//xảy ra ngoại lệ khi rỗng
        System.out.println("head:"+queue.peek()); //trả về null khi rỗng
        System.out.println("iterating the queue elements:");
        Iterator itr =queue.iterator();
    }
}
