package ru.ilukhinayana.hw2calcapp._main;

import ru.ilukhinayana.hw2calcapp.service.ResultWriterService;
import ru.ilukhinayana.hw2calcapp.service.UserGreeting;
import ru.ilukhinayana.hw2calcapp.util.Calculator;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        UserGreeting.greeting();
        Scanner scan = new Scanner(System.in);
        char operation;
        //= scan.next().charAt(0);
        do {
            operation = scan.next().charAt(0);
            if ((operation != '+') && (operation != '-') && (operation != '*')) {
                System.out.print("Такой операции нет! Повторите ввод операции (+ или - или *): ");
            }
        } while ((operation != '+') && (operation != '-') && (operation != '*'));

        System.out.print("Введи первое число: ");
        double number1 = scan.nextDouble();
        System.out.print("Операция \"" + operation + "\"\nВведи второе число: ");
        double number2 = scan.nextDouble();
        double resultation;
        switch (operation) {
            case '+':
                // Можно вызвать метод как аргумент метода, но читаемо ли это?
                ResultWriterService.resultWriter(number1, number2, Calculator.sum(number1, number2), "сложение");
                break;
            case '-':
                resultation = Calculator.subtract(number1, number2);
                ResultWriterService.resultWriter(number1, number2, resultation, "вычитание");
                break;
            case '*':
                resultation = Calculator.multiply(number1, number2);
                ResultWriterService.resultWriter(number1, number2, resultation, "умножение");
                break;
            default:
                System.out.print("Выбрана неправильная операия..."); // Бесполезно, но канонично
        }
    }
}
