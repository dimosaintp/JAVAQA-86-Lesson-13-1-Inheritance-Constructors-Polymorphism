package ru.netology.study;

// Наследование.
// Класс Product - общий класс, описывающий общую логику для всех товаров.
// В Product размещаем данные релевантные для каждого типа товаров.
// Для того чтобы наследный класс, например, Book, мог получить доступ к этим данным,
// данные должны быть protected, а не private.

public class Product {
    protected int id;
    protected String name;
    protected int price;

    // Конструкторы при наследовании.

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Геттеры и сеттеры.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Методы.

    public boolean isTooExpensive() {
        if (price > 1_000_000) {
            return true;
        } else {
            return false;
        }

    }
}