import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    String name;
    int roll;
    int age;
  Student(){}
    Student(String name, int roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    @Override
    public String toString() {
        return age + " " + name + " " + roll;
    }

    @Override
    public int compareTo(Student o) {
      if(roll>o.roll) return 1;
      else if( roll==o.roll) return 0;
      else return-1;
    }

}

public class comparable {
    public static void main(String[] args) {
        List<Student> l1 = new LinkedList<>();
        l1.add(new Student("Adnan", 1, 20));
        l1.add(new Student("Iqra", 1, 18));
        l1.add(new Student("Abdus", 2, 21));
        l1.add(new Student("Anupam", 6, 22));
        l1.add(new Student("Jai", 3, 20));
        l1.add(new Student("Sparsh", 5, 19));
        // System.out.println("Before Sort");
       Iterator itr=l1.iterator();
      
        Collections.sort(l1);

        // System.out.println("After Sort");
        while(itr.hasNext())
        System.out.println(itr.next());
    }
}
