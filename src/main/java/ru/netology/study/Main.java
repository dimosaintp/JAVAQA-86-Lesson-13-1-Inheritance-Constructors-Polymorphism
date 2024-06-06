package ru.netology.study;

public class Main {
    public static void main(String[] args) {
        Product book = new Book(
                1,
                "The Great Gatsby",
                10_000,
                "F. Scott Fitzgerald",
                400,
                1925
        );

        Product tShirt = new TShirt(
                2,
                "Boss",
                15_000,
                "L",
                "red");

        book.setPrice(12_000);
        tShirt.setPrice(7_000);
        System.out.println(book.isTooExpensive());
        System.out.println(tShirt.isTooExpensive());
    }
}