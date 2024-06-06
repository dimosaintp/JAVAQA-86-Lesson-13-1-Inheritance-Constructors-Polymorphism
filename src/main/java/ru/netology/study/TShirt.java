package ru.netology.study;

public class TShirt extends Product {
    private String size;
    private String color;

    // Конструкторы при наследовании.

    public TShirt(int id, String name, int price, String size, String color) {

        super(id, name, price);
        this.size = size;
        this.color = color;
    }

    // Геттеры и сеттеры.

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Методы.

    @Override
    public boolean isTooExpensive() {
        if (price > 10_000) {
            return true;
        } else {
            return false;
        }
    }
}