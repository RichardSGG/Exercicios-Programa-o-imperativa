package Lista1ponto;

import java.util.Scanner;

public class Q15 {
    static Scanner sc = new Scanner(System.in);

    public static void Loggi(int n) {
        int distancias[][] = new int[n][n];
        int maior = 0;
        int[] posicao = new int[2];
        int somaA = 0;
        int soma = 0;
        int linha = 0;
        boolean diagonalComZeros = true;
        boolean encontrouForaDiagonal = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distancias[i][j] = sc.nextInt();
                soma += distancias[i][j];
            }
            if (i == 0) {
                somaA = soma;
            }
            if (somaA > soma) {
                somaA = soma;
                linha = i;
            }
            soma = 0;

        }

        for (int i = 0; i < n; i++) {
            if (distancias[i][i] != 0) {
                diagonalComZeros = false;
            }
            for (int j = 0; j < n; j++) {
                if (i != j && (!encontrouForaDiagonal || distancias[i][j] > maior)) {
                    encontrouForaDiagonal = true;
                    maior = distancias[i][j];
                    posicao[0] = i;
                    posicao[1] = j;
                }
            }
        }

        System.out.println("Diagonal principal com zeros: " + (diagonalComZeros ? "sim" : "nao"));
        System.out.println("Maior valor fora da diagonal: " + maior + " (" + posicao[0] + "," + posicao[1] + ")");
        System.out.println("Linha com menor soma: " + linha);
    }

    public static void main(String[] args) {
        Loggi(sc.nextInt());

    }

}
