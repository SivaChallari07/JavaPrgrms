package javaPrgrms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);

        list.toArray(array);

        System.out.println("Shuffled array: " + Arrays.toString(array));
    }
}
