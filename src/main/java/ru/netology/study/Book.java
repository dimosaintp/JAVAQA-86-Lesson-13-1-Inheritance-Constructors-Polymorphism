package ru.netology.study;

// Здесь размещаем данные релевантные для Book.
// Класс Book должен взять за основу, класс Product, и добавлять через класс Book данные своего типа.
// Здесь же мы можем изменить логику метода isTooExpensive, так как мы его наследуем здесь.
// Здесь мы его получили в той версии, в которой он был записан в классе Product.
// Например, можем изменить сумму, по которой мы считаем книгу дорогой или нет.

// Переопределённый метод класса Product определяющий является ли товар дорогим.
// Главное не ошибиться в названии метода, иначе он будет считаться новым методом, не переопределённым.
// @Override - аннотация, которая позволит понять, что метод определён в наследуемом классе.

public class Book extends Product {
    private String author;
    private int pages;
    private int publishedYear;

    // Конструкторы при наследовании.

    public Book(int id, String name, int price, String author, int pages, int publishedYear) {
        super(id, name, price);  // super - вызов родительского конструктора.
        this.author = author;
        this.pages = pages;
        this.publishedYear = publishedYear;
    }

    // Геттеры и сеттеры.

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    // Полиморфизм. Методы.

    @Override
    public void use() {
        System.out.println("Читаем книгу " + name);
    }
}