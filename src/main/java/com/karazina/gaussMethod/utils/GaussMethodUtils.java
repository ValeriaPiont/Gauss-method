package com.karazina.gaussMethod.utils;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.*;
import java.util.Scanner;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class GaussMethodUtils {

    private static final int NUMBER_OF_ARGUMENTS = 3;

    @Getter
    @Setter
    private static double[][] coefficients = new double[NUMBER_OF_ARGUMENTS][NUMBER_OF_ARGUMENTS];

    @Getter
    @Setter
    private static double[] values = new double[NUMBER_OF_ARGUMENTS];

    /**
     * Вывод аргументов уравнения
     */
    public static void writeArguments(double[] arguments) {
        System.out.println("Arguments:");
        for (int i = 0; i < arguments.length; i++) {
            System.out.println("x" + (i + 1) + " = " + arguments[i]);
        }
        System.out.println();
    }

    /**
     * Чтение матрицы из файла
     */
    public static void read(String path) throws IOException {
        try(Scanner scanner = new Scanner(new File(path))) {
            for (int i = 0; i < coefficients.length; i++) {
                for (int j = 0; j < coefficients[i].length; j++) {
                    coefficients[i][j] = scanner.nextDouble();
                }
                values[i] = scanner.nextDouble();
            }
        }
    }

    /**
     * Чтение матрицы с консоли
     */
    public static void read() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter coefficients: ");
        for (int i = 0; i < coefficients.length; i++) {
            for (int j = 0; j < coefficients[i].length; j++) {
                System.out.print("a" + (i + 1) + (j + 1) + " = ");
                coefficients[i][j] = Double.parseDouble(reader.readLine());
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Enter values: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print("b" + (i + 1) + " = ");
            values[i] = Double.parseDouble(reader.readLine());
            System.out.println();
        }
    }

    /**
     * Вывод решенной системы уравнений
     */
    public static String writeSystem(double[][] arguments) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < coefficients.length; i++) {
            for (int j = 0; j < coefficients[i].length; j++) {
                stringBuilder.append(coefficients[i][j]).append(" ");
            }
            stringBuilder.append(" ").append(values[i]).append("\n");
        }
        return stringBuilder.toString();
    }

}
