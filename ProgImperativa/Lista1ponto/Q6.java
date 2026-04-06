package Lista1ponto;

import java.util.Scanner;
import java.util.Arrays;

public class Q6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Corrida(sc.nextInt());

    }

    public static void Corrida(int n) {
        double tempos[] = new double[n];

        for (int i = 0; i < tempos.length; i++) {
            tempos[i] = sc.nextDouble();
        }

        Arrays.sort(tempos);

        System.out.println("Melhor tempo: " + tempos[0]);
        System.out.println("Pior tempo: " + tempos[n - 1]);
        if (n >= 3) {
            System.out.println(tempos[0] + " " + tempos[1] + " " + tempos[2]);
        } else {
            for (int i = 0; i < tempos.length; i++) {
                System.out.print(tempos[i] + " ");

            }
        }
    }
}
