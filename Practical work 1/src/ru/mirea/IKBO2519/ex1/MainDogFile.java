package ru.mirea.IKBO2519.ex1;

import java.net.SocketOption;

public class MainDogFile {
    public static void main(String[] args) {
     Dog d1 = new Dog("Бобби",4);
     Dog d2 = new Dog("Шарик",6);
     Dog d3 = new Dog("Микки",2);
     d3.setAge(1);
     System.out.println(d3);
     d1.intoHumanAge();
     d2.intoHumanAge();
     d3.intoHumanAge();
    }
}
