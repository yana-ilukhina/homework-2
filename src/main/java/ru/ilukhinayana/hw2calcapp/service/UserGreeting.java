package ru.ilukhinayana.hw2calcapp.service;

public class UserGreeting {

    public static void greeting() {
        System.out.println("Здравствуй, пользователь! \nЭто приложение Калькулятор \n");
        System.out.println("Калькулятор может:\n1. Сложить (+) два числа\n" +
                "2. Вычисть (-) из одного числа другое\n3. Умножить (*) два числа\n");
        System.out.println("Этот калькулятор может работать с вещественными числами, " +
                "правильная запись \"с запятой\", например: 10,5\n");
        System.out.print("Введи символ операции (+ или - или *), которую хочешь совершить: ");
    }
}
