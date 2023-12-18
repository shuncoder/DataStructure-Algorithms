import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        /*
        implementation của Queue như sau:
            LinkedList
            PriorityQueue
            ArrayDeque
         */
        Queue<String> myQueue = new LinkedList<>();
//      add(), offer(): thêm phần tử vào cuối if queue full add sẽ ném ra ngoại lệ  , offer sẽ trả ra giá trị false.
        myQueue.add("a");
        myQueue.offer("b");
//      peek(), element(): lấy ra phần tử ở đầu hàng đợi.
        System.out.println(myQueue.peek());
        System.out.println(myQueue.element());
//      poll(), remove(): lấy ra phần tử ở đầu hàng đợi và xóa nó.
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.remove());
//      clear(): xóa tất cả phần tử trong hàng đợi.
//        myQueue.clear();
//      isEmpty(): kiểm tra hàng đợi có rỗng hay không.
//        System.out.println(myQueue.isEmpty());
//      contains(): kiểm tra phần tử đã có trong hàng đợi.
        System.out.println(myQueue.contains("b"));
//      size(): trả về kích thước của queue;
        System.out.println(myQueue.size());
//      duyệt các phần tử trong hàng đợi.
        for (String element: myQueue){
            System.out.print(element + "\t");
        }
    }
}