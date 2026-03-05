package tut8;

import java.util.Arrays;

public class PrintArray<T> {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        PrintArray<Integer> p = new PrintArray<>(); 
        p.printArray(arr);
        int[] arr2 = {1, 2, 3, 4, 5};
        // Generics do not support primitive types.
        // PrintArray<int> p2 = new PrintArray<>(); 
        p.printArray(arr2);
    }

    public void printArray(T[] arr) {
        for (T t : arr) {
            System.out.println(t);
        }
    }
    public void printArray(int[] arr) {
    Arrays.stream(arr).forEach(System.out::println);
}


}