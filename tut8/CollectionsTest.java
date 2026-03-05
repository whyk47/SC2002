package tut8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        int largest = Collections.max(list);
        int smallest = Collections.min(list);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        // Throws an error
        // list.add(null);
        // Collections.sort(list);
        list.sort(null);
        System.out.println(list);
        /* Collections.sort() is a static utility method that accepts a List as an argument, 
        while List.sort() is an instance method of the List interface*/
    }
}
