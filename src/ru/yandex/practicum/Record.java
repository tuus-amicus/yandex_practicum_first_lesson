package ru.yandex.practicum;

public class Record {
    String itemName;
    Boolean isExpense;
    Integer sumOfOne;
    Integer quantity;


    public Record(String itemName, Boolean isExpense, Integer sumOfUn, Integer quantity) {
        this.itemName = itemName;
        this.isExpense = isExpense;
        this.sumOfOne = sumOfUn;
        this.quantity = quantity;
    }
}
