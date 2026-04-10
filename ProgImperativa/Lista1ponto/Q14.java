package Lista1ponto;

import java.util.Scanner;

public class Q14 {
    static Scanner farm = new Scanner(System.in);

    public static void main(String[] args) {
        Fazenda(farm.nextInt(), farm.nextInt());
    }

    public static void Fazenda(int l, int c) {
        double soma = 0;
        int cultivo[][] = new int[l][c];
        int linhas[] = new int[l];
        int colunas[] = new int[c];
        int ma = 0;
        int me = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                cultivo[i][j] = farm.nextInt();
                soma += cultivo[i][j];
                linhas[i] += cultivo[i][j];
                colunas[j] += cultivo[i][j];
            }
        }

        double media = soma / (l * c);
        int acima = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (media < cultivo[i][j]) {
                    acima += 1;
                }
                if (linhas[ma] < linhas[i]) {
                    ma = i;
                }
                if (colunas[me] > colunas[j]) {
                    me = j;
                }

            }
        }

        System.out.println("Linha com maior soma: " + ma);
        System.out.println("Coluna com menor soma: " + me);
        System.out.printf("Media geral: %.2f%n", media);
        System.out.println("Quantidade acima da media: " + acima);

    }
}
