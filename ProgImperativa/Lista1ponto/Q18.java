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
        for (int i = 0; i < sensor.length; i++) {
            for (int j = 0; j < sensor[0].length; j++) {
                sensor[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < sensor.length; i++) {
            for (int j = 0; j < sensor[0].length; j++) {
                boolean Pico = true;
                if (i > 0 && sensor[i][j] <= sensor[i - 1][j])
                    Pico = false;
                if (i < l - 1 && sensor[i][j] <= sensor[i + 1][j])
                    Pico = false;
                if (j > 0 && sensor[i][j] <= sensor[i][j - 1])
                    Pico = false;
                if (j < c - 1 && sensor[i][j] <= sensor[i][j + 1])
                    Pico = false;
                if (Pico) {
                    picos++;
                    if (sensor[i][j] > maior) {
                        maior = sensor[i][j];
                        posicao[0] = i;
                        posicao[1] = j;
                    }
                }
            }
        }
        System.out.println("Quantidade de pontos de pico: " + picos);
        System.out.printf("Posicao do maior ponto de pico: %d %d%n", posicao[0], posicao[1]);
        System.out.println("Valor do maior ponto de pico: " + maior);
    }
}
