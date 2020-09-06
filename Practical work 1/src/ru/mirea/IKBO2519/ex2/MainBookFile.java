package ru.mirea.IKBO2519.ex2;

public class MainBookFile {
    public static void main(String[] args) {
        Book d1 = new Book("Война и мир",4);
        Book d2 = new Book("Евгений Онегин",1);
        Book d3 = new Book("Мертвые души",1);
        d2.setCountOfBooks(2);
        System.out.println(d2);
        d1.intoPriceForAllCollection();
        d2.intoPriceForAllCollection();
        d3.intoPriceForAllCollection();
    }
}
