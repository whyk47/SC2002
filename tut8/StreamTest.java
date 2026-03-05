package tut8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "Bob", "Charlie", "David");
        System.out.println(list);

        List<String> list1 = list.stream()
        .filter(s -> s.length() >= 5)
        .map(String::toUpperCase)
        .collect(Collectors.toList());
        System.out.println(list1);
        
        long num = list.stream()
        .filter(s -> s.length() >= 5)
        .map(String::toUpperCase)
        .count();
        System.out.println(num);

        List<List<Integer>> nestedNumbers = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8)
        );

        List<Integer> flattenedList = nestedNumbers.stream()
        .flatMap(List::stream) // one-to-many transformation and flattening
        .collect(Collectors.toList());

        System.out.println(flattenedList);

        Runnable r = () -> System.out.println("Hello World");
        r.run();
        // lambda cannot replace multi method interface
        // Shorter code, easier to read, better for functional interfaces

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);    
        // Modifications not allowed in enhanced for loop. No index based access


        Test[] values = {new Test(1), new Test(2), new Test(3)};
        for (Test t : values) {
            System.out.print(t.value);
        }
    }
}


