package ru.ilukhinayana.hw2calcapp.service;

public class ResultWriterService {
    public static void resultWriter (double num1, double num2, double result, String operation){ // метод Вывода результата
        System.out.println("Операция " + operation + " с числами " + num1 + " и " + num2 +
                ", результат " + result);
    }
}
