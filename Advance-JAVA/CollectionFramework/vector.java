
import java.util.Collections;
import java.util.Enumeration;

import java.util.Vector;

class vector {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        vector.add(4);
        vector.add(14);
        vector.add(1);
        vector.add(5);
        vector.add(11);
        if (vector.contains(40))
            System.out.println("element is present");
        else
            System.out.println("element is not present");
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        Collections.sort(vector);
        System.out.println();
        enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
    }
}
