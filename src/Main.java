//Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
//- сравнивает эти два числа и возвращает результат сравнения путем вывода в
//консоль одного из вариантов: "a > b", "a < b" или "a = b";
//- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль..

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа: ");

        double a;
        double b;
        double ans;
        char op;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        if (Double.compare(a, b) < 0) {
            System.out.println("a меньше b");
        } else if (Double.compare(a, b) > 0) {
            System.out.println("a больше b");
        } else {
            System.out.println("a равно b");
        }
        System.out.print("\nВыберите дальнейшее действие с числами: (+, -, *, /): ");
        op = scanner.next().charAt(0);
        switch(op) {
            case '+':
                ans = a + b;
                break;
            case '-':
                ans = a - b;
                break;
            case '*':
                ans = a * b;
                break;
            case '/':
                ans = a / b;
                break;
            default:
                System.out.printf("Неверно! Введите корректный оператор");
                return;
        }
        System.out.print("\nРезультат:\n");
        System.out.printf(a + " " + op + " " + b + " = " + ans + "\n");

//Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
//В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String c = in.nextLine();
        System.out.print("Введите вторую строку: ");
        String q = in.nextLine();

        if (c.equals(q)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }

    }

}



