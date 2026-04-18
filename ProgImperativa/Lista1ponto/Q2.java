package Lista1ponto;

import java.util.Scanner;

public class Q2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int alunos = sc.nextInt();
        Escola(alunos);

    }

    public static void Escola(int n) {
        double[] alunos = new double[n];
        double notas = 0;
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = sc.nextDouble();
            notas += alunos[i];
        }
        double media = notas / n;

        int aprovados = 0;
        double maior = alunos[0];
        double menor = alunos[0];

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] >= 7) {
                aprovados++;
            }
            if (alunos[i] > maior) {
                maior = alunos[i];
            }
            if (alunos[i] < menor) {
                menor = alunos[i];
            }
        }

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.printf("Media da turma: %.2f%n", media);
        System.out.println("Quantidade de aprovados: " + aprovados);

    }

}
