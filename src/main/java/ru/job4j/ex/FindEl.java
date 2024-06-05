package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (key.equals(value[index])) {
                result = index;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Элемент не найден");
        }
        return result;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (String key : abuses) {
            if (value.equals(key)) {
                throw new ElementAbuseException("Ключ запрещен");
            }
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"Test1", "Test2", "Test3"}, "Test");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
