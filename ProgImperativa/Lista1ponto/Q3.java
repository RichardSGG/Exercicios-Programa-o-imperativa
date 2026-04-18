package Lista1ponto;

import java.util.Scanner;

public class Q3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Prices(sc.nextInt());

    }

    public static void Prices(int n) {
        double valores[] = new double[n];
        double soma1 = 0;
        double soma2 = 0;

        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextDouble();
            soma1 += valores[i];
        }

        int ajuste = sc.nextInt();
        double fator = 1 + ajuste / 100.0;

        System.out.println("Novos precos:");

        for (int j = 0; j < valores.length; j++) {
            valores[j] *= fator;
            soma2 += valores[j];
            if (j > 0) {
                System.out.print(" ");
            }
            System.out.printf("%.2f", valores[j]);
        }
        System.out.println();
        System.out.printf("Total antes do reajuste: %.2f%n", soma1);
        System.out.printf("Total depois do reajuste: %.2f%n", soma2);

    }

}
