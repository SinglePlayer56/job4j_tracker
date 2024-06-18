package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftCodes = left.split("/");
        String[] rightCodes = right.split("/");
        int result = rightCodes[0].compareTo(leftCodes[0]);
        return result != 0 ? result : left.compareTo(right);
    }
}
