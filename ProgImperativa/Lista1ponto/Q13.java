package Lista1ponto;

import java.util.Scanner;

public class Q13 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Intensidade(sc.nextInt(), sc.nextInt());
    }

    public static void Intensidade(int l, int c) {
        int matriz[][] = new int[l][c];
        int maior = 0;
        double total = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
                total += matriz[i][j];
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        double media = total / (l *c);
        int k = sc.nextInt();
        int contar = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
            if(matriz[i][j] > k){
                contar ++;
            }
            }
        }

        System.out.printf("Media dos elementos: %.2f%n" , media);
        System.out.println("Maior elemento: " + maior );
        System.out.printf("Quantidade acima de %d: %d", k, contar);


    }
}
