package Lista1ponto;

import java.util.Scanner;

public class Q12 {
    static Scanner troca = new Scanner(System.in);

    public static void main(String[] args) {
        Matriz(troca.nextInt(), troca.nextInt());
    }

    public static void Matriz(int l, int c) {
        int valores[][] = new int[l][c];
        int backup[] = new int[(l * c)];
        int b = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                valores[i][j] = troca.nextInt();
                backup[b] = valores[i][j];
                b += 1;
            }
        }

        int r = troca.nextInt();
        int s = troca.nextInt();
        int a = 0;
        int valores2[][] = new int[r][s];

        if ((l * c) == (r * s)) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < s; j++) {
                    valores2[i][j] = backup[a];
                    a += 1;
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < s; j++) {
                    System.out.print(valores2[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Reorganização impossível");
        }

    }

}
