import java.util.*;

class Main {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int num : numbers) {
            linkedList.add(num);
        }

        System.out.println(linkedList);

    }
}