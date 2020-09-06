package ru.mirea.IKBO2519.ex2;
import java.lang.String;

public class Book {
    private String Label;
    private int CountOfBooks;

    public Book(String label, int countOfBooks) {
        Label = label;
        CountOfBooks = countOfBooks;
    }

    public String getLabel() {
        return Label;
    }

    public int getCountOfBooks() {
        return CountOfBooks;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public void setCountOfBooks(int countOfBooks) {
        CountOfBooks = countOfBooks;
    }

    public String toString(){
        return this.Label +" выпускается в "+this.CountOfBooks +" книгах.";
    }

    public void intoPriceForAllCollection() {
        System.out.println(Label +"будет стоить "+ CountOfBooks * 968+" рублей.");
    }
}
