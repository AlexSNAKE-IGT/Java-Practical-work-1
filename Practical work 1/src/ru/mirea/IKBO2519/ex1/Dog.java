package ru.mirea.IKBO2519.ex1;
import java.lang.String;

public class Dog {
    private String Name;
    private int Age;

    public Dog(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String toString(){
        return this.Name+" сейчас "+this.Age+"лет .";
    }

    public void intoHumanAge() {
        System.out.println(Name+" в человеческом измерении "+Age*7+" лет.");
    }
}
