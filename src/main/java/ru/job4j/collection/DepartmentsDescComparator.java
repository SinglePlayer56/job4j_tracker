package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftCodes = left.split("/");
        String[] rightCodes = right.split("/");
        int result = rightCodes[0].compareTo(leftCodes[0]);
        if (result != 0) {
            return result;
        }
        int minSize = Math.min(leftCodes.length, rightCodes.length);
        for (int i = 1; i < minSize; i++) {
            result = leftCodes[i].compareTo(rightCodes[i]);
            if (result != 0) {
                return result;
            }
        }
        return Integer.compare(leftCodes.length, rightCodes.length);
    }
}
