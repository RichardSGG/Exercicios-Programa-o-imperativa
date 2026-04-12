package Lista1ponto;

import java.util.Scanner;

public class Q19 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        Auditoria(n);

    }

    public static void Auditoria(int n) {
        int matriz[][] = new int[n][n];
        int linhas[] = new int[n];
        int colunas[] = new int[n];
        int diagp = 0;
        int diags = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
                linhas[i] += matriz[i][j];
                colunas[j] += matriz[i][j];
                if (i == j) {
                    diagp += matriz[i][j];
                }
                if (j == (n - 1 - i)) {
                    diags += matriz[i][j];
                }
            }
        }
        String mc;
        int diferente = 0;
        int vc = 0;
        int comum = linhas[0];

        for (int i = 1; i < n; i++) {
            if (linhas[i] != comum)
                diferente++;
        }

        for (int j = 0; j < n; j++) {
            if (colunas[j] != comum)
                diferente++;
        }

        if (diagp != comum){
            diferente++;
        }
        if (diags != comum){
            diferente++;
        }
        if (diferente == 0) {
            mc = "sim";
            vc = comum;
        } else {
            mc = "nao";
        }

        if (mc.equals("sim")) {
            System.out.println("Matriz consistente: " + mc);
            System.out.println("Valor comum das somas: " + vc);
        } else if (mc.equals("nao")) {
            System.out.println("Matriz consistente: " + mc);
            System.out.println("Quantidade de estruturas com soma diferente da primeira linha: " + diferente);
        }

    }

}
