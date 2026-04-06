package Lista1ponto;

import java.util.Scanner;

public class Q7 {
    static Scanner btg = new Scanner(System.in);

    public static void main(String[] args) {

        Banco(btg.nextInt(), btg.nextInt());

    }

    public static void Banco(int l, int c) {
        int contas[][] = new int[l][c];
        int somaAtual = 0;
        int maiors = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                contas[i][j] = btg.nextInt();
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                somaAtual += contas[i][j];
            }
            if (somaAtual > maiors) {
                maiors = somaAtual;
            }
            System.out.println("Soma da linha " + i + ": " + somaAtual);
            somaAtual = 0;
        }

        System.out.println("Maior soma: " + maiors);

    }
}
