package ru.job4j.tracker;

public class MockInput implements Input {
    @Override
    public String askStr(String question) {
        return "";
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
