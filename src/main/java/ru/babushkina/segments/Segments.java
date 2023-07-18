package ru.babushkina.segments;

import java.util.Scanner;

public class Segments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки A (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Введите координаты точки B (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double num1 = x2 - x1;
        double num2 = y2 - y1;

        double distance = Math.sqrt(num1 * num1 + num2 * num2);
        System.out.println("Длина отрезка AB равна: " + distance);
    }
}
