package ru.mirea.IKBO2519.ex3;
import java.lang.String;

public class Ball {
    private String Type;
    private int Radius;

    public Ball(String type, int radius) {
        Type = type;
        Radius = radius;
    }

    public String getType() {
        return Type;
    }

    public int getRadius() {
        return Radius;
    }

    public void setType(String name) {
        Type = name;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }

    public String toString(){
        return this.Type+" мяч имеет радиус "+this.Radius +"см.";
    }

    public void intoMmRadius() {
        System.out.println(Type+" мяч радиус которого был переведен в миллиметры имеет радиус "+ Radius *10+" мм.");
    }
}
