import java.util.*;
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(-5);
        arrayList.add(25);
        arrayList.add(05);
        arrayList.add(15);
        arrayList.add(-85);
        // iterator is support by all collection to iterate
        Iterator<Integer> itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        ListIterator<Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        // or
        // List Iterator is used only for in list and has power to print in reverse
        System.out.println();
        listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");

        }

    }
}
