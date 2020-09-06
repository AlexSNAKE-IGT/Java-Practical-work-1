package ru.mirea.IKBO2519.ex3;

public class MainBallFile {
    public static void main(String[] args) {
        Ball d1 = new Ball("Волейбольный",10);
        Ball d2 = new Ball("Баскетбольный",11);
        Ball d3 = new Ball("гольфийский",2);
        d2.setRadius(14);
        System.out.println(d2);
        d1.intoMmRadius();
        d2.intoMmRadius();
        d3.intoMmRadius();
    }
}
