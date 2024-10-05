package ru.ilukhinayana.hw2calcapp._main;

import ru.ilukhinayana.hw2calcapp.service.ResultWriterService;
import ru.ilukhinayana.hw2calcapp.util.Calculator;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args){
        System.out.println("Здравствуй, пользователь! \nЭто приложение Калькулятор \n");
        System.out.println("Калькулятор может:\n1. Сложить (+) два числа\n" +
                "2. Вычисть (-) из одного числа другое\n3. Умножить (*) два числа\n");
        System.out.println("Этот калькулятор может работать с нецелыми числами, " +
                "правильная запись \"с запятой\", например: 10,5\n");
        System.out.print("Введи символ операции (+ или - или *), которую хочешь совершить: ");

        Scanner scan = new Scanner(System.in);
        char operation = scan.next().charAt(0);

        while ((operation != '+') && (operation != '-') && (operation != '*')) {
            System.out.print("\nТакой операции нет! Повторите ввод операции (+ или - или *): ");
            operation = scan.next().charAt(0);
        }

        System.out.print("\nВведи первое число: ");
        double number1 = scan.nextDouble();

        System.out.print("Операция \"" + operation + "\"\nВведи второе число: ");
        double number2 = scan.nextDouble();

        double resultation;

        switch (operation){
            case '+':
                resultation = Calculator.sum(number1, number2);
                ResultWriterService.resultWriter(number1, number2, resultation, "сложение");
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
                System.out.print("Выбрана неправильная операия...");
        }

    }
}
