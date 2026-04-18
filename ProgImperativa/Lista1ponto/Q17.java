package Lista1ponto;

import java.util.Scanner;

public class Q17 {
    static Scanner banco = new Scanner(System.in);

    public static void main(String[] args) {
        Caixa(banco.nextInt(), banco.nextInt());

    }

    public static void Caixa(int l, int c) {
        int valores[][] = new int[l][c];
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[0].length; j++) {
                valores[i][j] = banco.nextInt();
            }
        }

        int somal = 0;
        int linha = 0;
        boolean primeiraLinha = true;

        for (int i = 0; i < l; i++) {
            int[] linhaAtual = new int[c];
            for (int j = 0; j < c; j++) {
                linhaAtual[j] = valores[i][j];
            }
            int melhorLinhaAtual = maiorSomaContigua(linhaAtual);
            if (primeiraLinha || melhorLinhaAtual > somal) {
                primeiraLinha = false;
                somal = melhorLinhaAtual;
                linha = i;
            }
        }

        int somac = 0;
        int coluna = 0;
        boolean primeiraColuna = true;

        for (int j = 0; j < c; j++) {
            int[] colunaAtual = new int[l];
            for (int i = 0; i < l; i++) {
                colunaAtual[i] = valores[i][j];
            }
            int melhorColunaAtual = maiorSomaContigua(colunaAtual);
            if (primeiraColuna || melhorColunaAtual > somac) {
                primeiraColuna = false;
                somac = melhorColunaAtual;
                coluna = j;
            }
        }

        System.out.println("Maior soma contigua em linha: " + somal);
        System.out.println("Linha da maior soma contigua: " + linha);
        System.out.println("Maior soma contigua em coluna: " + somac);
        System.out.println("Coluna da maior soma contigua: " + coluna);

    }

    public static int maiorSomaContigua(int[] valores) {
        int melhor = valores[0];
        int atual = valores[0];

        for (int i = 1; i < valores.length; i++) {
            atual = Math.max(valores[i], atual + valores[i]);
            if (atual > melhor) {
                melhor = atual;
            }
        }

        return melhor;
    }
}

// linha == agencia
// coluna == dia
