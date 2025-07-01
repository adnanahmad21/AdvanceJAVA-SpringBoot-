import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;
public class map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Adnan", 28);
        map.put("Iqra", 31);
        map.put("Saboor", 1);
        map.put("Sparsh", 48);
        map.put("JAI", 17);
        Set<String> set = map.keySet();
        Iterator<String> itr = set.iterator();
        while ((itr.hasNext())) {
            String k = itr.next();
            System.out.print(k + " " + map.get(k));
            System.out.println();
        }
    }
}
