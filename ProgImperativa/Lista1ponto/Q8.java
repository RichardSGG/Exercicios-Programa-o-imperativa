package Lista1ponto;

import java.util.Scanner;

public class Q8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Escola(sc.nextInt(), sc.nextInt());

    }

    public static void Escola(int l, int c) {
        double[][] notas = new double[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                notas[i][j] = sc.nextDouble();
            }
        }

        double mediaAln = 0;
        double somaAtual = 0;
        int aprovados = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                somaAtual += notas[i][j];
            }
            mediaAln = somaAtual / c;
            if (mediaAln >= 7) {
                aprovados++;
            }
            System.out.printf("Média do aluno %d: %.2f %n", i, mediaAln);
            somaAtual = 0;
        }

        somaAtual = 0;
        double mediaDis = 0;

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < l; j++) {
                somaAtual += notas[j][i];
            }
            mediaDis = somaAtual / l;
            System.out.printf("Média da avaliação %d: %.2f %n", i, mediaDis);
            somaAtual = 0;
        }
        System.out.println("Quantidade de alunos aprovados: " + aprovados);

    }

}
