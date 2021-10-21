package practice.task1;

import java.util.Scanner;

public class Calculator {
    public double add (int a, int b) {
        return a + b;
    }

    public double sub (int a, int b) {
        return a - b;
    }

    public double mul (int a, int b) {
        return a * b;
    }

    public double div (int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Выберите действие (add, sub, mul, div): ");
        String action = sc.nextLine();

        System.out.println("Введите число а: ");
        int a = sc.nextInt();

        System.out.println("Введите число b: ");
        int b = sc.nextInt();

        switch (action) {
            case "add":
                System.out.println(calc.add(a, b));
                break;
            case "sub":
                System.out.println(calc.sub(a, b));
                break;
            case "mul":
                System.out.println(calc.mul(a, b));
                break;
            case "div":
                try {
                    System.out.println(calc.div(a, b));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Неверный выбор действия");
        }
    }
}
