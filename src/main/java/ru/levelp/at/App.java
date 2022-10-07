package ru.levelp.at;

import java.util.concurrent.Callable;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Сумма");

        System.out.printf("2+2 " + calculator.sum(2, 2));

        System.out.println("=======");
    }
}
