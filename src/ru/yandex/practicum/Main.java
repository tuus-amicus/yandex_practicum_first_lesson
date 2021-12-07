package ru.yandex.practicum;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader();

        reader.parseToRecords("/Users/dee/tmp/m.202101.csv");
    }
}
