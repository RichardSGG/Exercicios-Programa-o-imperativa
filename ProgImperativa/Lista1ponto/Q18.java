package Lista1ponto;

import java.util.Scanner;

public class Q18 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Lab(sc.nextInt(), sc.nextInt());
    }

    public static void Lab(int l, int c) {
        int sensor[][] = new int[l][c];
        int picos = 0;
        int maior = 0;
        int posicao[] = new int[2];
        boolean encontrouPico = false;
        for (int i = 0; i < sensor.length; i++) {
            for (int j = 0; j < sensor[0].length; j++) {
                sensor[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < sensor.length; i++) {
            for (int j = 0; j < sensor[0].length; j++) {
                boolean pico = true;
                if (i > 0 && sensor[i][j] <= sensor[i - 1][j])
                    pico = false;
                if (i < l - 1 && sensor[i][j] <= sensor[i + 1][j])
                    pico = false;
                if (j > 0 && sensor[i][j] <= sensor[i][j - 1])
                    pico = false;
                if (j < c - 1 && sensor[i][j] <= sensor[i][j + 1])
                    pico = false;
                if (pico) {
                    picos++;
                    if (!encontrouPico || sensor[i][j] > maior) {
                        encontrouPico = true;
                        maior = sensor[i][j];
                        posicao[0] = i;
                        posicao[1] = j;
                    }
                }
            }
        }
        if (!encontrouPico) {
            posicao[0] = -1;
            posicao[1] = -1;
            maior = 0;
        }
        System.out.println("Quantidade de pontos de pico: " + picos);
        System.out.printf("Posicao do maior ponto de pico: %d %d%n", posicao[0], posicao[1]);
        System.out.println("Valor do maior ponto de pico: " + maior);
    }
}
