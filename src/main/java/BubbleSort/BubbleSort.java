package BubbleSort;

import java.util.*;

public class BubbleSort {
    List<String> sort(List<String> names) {
        List<String> namesCopy = new ArrayList<>(names);
        Collections.sort(namesCopy);
        return namesCopy;
    }
}
