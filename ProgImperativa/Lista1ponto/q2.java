package Lista1ponto;

import java.util.Scanner;;

public class Q2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int alunos = sc.nextInt();
        Escola(alunos);

    }

    public static void Escola(int n) {
        double[] alunos = new double[n];
        int notas = 0;
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = sc.nextInt();
            notas += alunos[i];
        }
        double media = (double) notas / n;

        int aprovados = 0;
        double maior = alunos[0];
        double menor = alunos[0];

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] >= 7) {
                aprovados++;
            }
            if (alunos[i] >= maior) {
                maior = alunos[i];
            }
            if (alunos[i] <= menor) {
                menor = alunos[i];
            }
        }

        System.out.println("maior nota: " + maior);
        System.out.println("menor nota: " + menor);
        System.out.println("média da turma: " + media);
        System.out.println("Quantidade de aprovados: " + aprovados);

    }

}