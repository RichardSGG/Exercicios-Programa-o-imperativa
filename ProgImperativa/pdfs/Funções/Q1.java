package pdfs.Funções;

import java.util.Scanner;

public class Q1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Celsius(sc.nextDouble());

    }

    public static void Celsius(double c) {
        double f = c * 1.8 + 32;
        double k = c + 273.15;
        double Re = c * 0.8;
        double Ra = c * 1.8 + 32 + 459.67;

        System.out.printf("Fahrenheit: %f%n Kelvin: %f%n Réaumur: %f%n Rankine: %f", f, k, Re, Ra);

    }
}
