import java.util.*;

public class Queue1 {
  public static void main(String[] args) {
    Deque<Integer> l1 = new ArrayDeque<>();
    l1.add(55);
    l1.offer(21);
    l1.offer(1);
    l1.offer(1);
    l1.offer(41);
    l1.addFirst(5);

    System.out.println(l1);

  }
}
