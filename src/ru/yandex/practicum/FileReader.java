package ru.yandex.practicum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class FileReader {
    private String readSomeFile(String pathToFile) throws IOException {
        String content = Files.readString(Path.of(pathToFile));
        return content;
    }

    public ArrayList<Record> parseToRecords(String pathToFile) throws IOException {
        String content = readSomeFile(pathToFile);

        System.out.println("НАЧАЛО");

        String[] lines = content.split("\n");


        ArrayList<Record> records = new ArrayList<>();

        for (int i = 1; i < lines.length; i++) {
            String line = lines[i];

            String[] recordLines = line.split(",");

            Record record = new Record(recordLines[0], Boolean.valueOf(recordLines[1]), Integer.valueOf(recordLines[3]), Integer.valueOf(recordLines[2]));

            System.out.println("Это isExpense");
            System.out.println(record.isExpense);
            System.out.println("Это itemName");
            System.out.println(record.itemName);
            System.out.println("Это quantity");
            System.out.println(record.quantity);
            System.out.println("Это sumOfOne");
            System.out.println(record.sumOfOne);

            records.add(record);
        }

        System.out.println("Размер нашего массива");
        System.out.println(records.size());

        return records;
    }
}

/**
 * dsjalkdjaslkjd
 */

/**
 * dsadasdas
 */

/**
 *  * dkjdsaljaskj
 */
