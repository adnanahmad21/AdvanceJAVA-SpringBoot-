import java.util.*;

public class set {
    public static void main(String[] args) {
        // ArrayList<Integer> arrayList = new ArrayList<>();
        // arrayList.add(5);
        // arrayList.add(10);
        // arrayList.add(-5);
        // arrayList.add(25);
        // arrayList.add(05);
        // arrayList.add(15);
        // arrayList.add(-85);
        // Set<Integer> set = new HashSet<>(arrayList);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(21);
        set.add(13);
        set.add(51);
        set.add(18);
        set.add(31);
        set.add(21);
        System.out.println(set.contains(1));
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            int x = (Integer) itr.next();
            if (x == 21)
                itr.remove();

        }
        itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");

        }

    }
}
