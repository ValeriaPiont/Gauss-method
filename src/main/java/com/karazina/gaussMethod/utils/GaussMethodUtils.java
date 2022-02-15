package com.karazina.gaussMethod.utils;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;
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
     * Вывод аргументов уравнения
     */
    public static void writeArguments(double[] arguments) {
        System.out.println("Arguments:");
        for (int i = 0; i < arguments.length; i++) {
            System.out.println("x" + (i + 1) + " = " + arguments[i]);
        }
        System.out.println();
    }


}
