package Lista1ponto;

import java.util.Scanner;

public class Q20 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Gelado(sc.nextInt(), sc.nextInt());
    }

    public static void Gelado(int l, int c) {
        int[][] matriz = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int temp = sc.nextInt();
        
        int recorde = 0;
        int melhorLinha = -1;
        int indiceI = -1;
        int indiceF = -1;

        for (int i = 0; i < l; i++) {
            int sequenciaAtual = 0;
            int inicioAtual = -1;

            for (int j = 0; j < c; j++) {
                if (matriz[i][j] > temp) {
                    if (sequenciaAtual == 0) {
                        inicioAtual = j;
                    }
                    sequenciaAtual++;
                } else {
                    if (sequenciaAtual > recorde) {
                        recorde = sequenciaAtual;
                        melhorLinha = i;
                        indiceI = inicioAtual;
                        indiceF = j - 1;
                    }
                    sequenciaAtual = 0;
                }
            }

            if (sequenciaAtual > recorde) {
                recorde = sequenciaAtual;
                melhorLinha = i;
                indiceI = inicioAtual;
                indiceF = c - 1;
            }
        }

        System.out.println("Maior sequencia acima de " + temp + ": " + recorde);
        System.out.println("Linha da sequencia: " + melhorLinha);
        System.out.println("Indice inicial: " + indiceI);
        System.out.println("Indice final: " + indiceF);
    }
}