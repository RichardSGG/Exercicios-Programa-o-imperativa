package Lista1ponto;

import java.util.Scanner;

public class Q11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Troca(sc.nextInt(), sc.nextInt());
    }

    public static void Troca(int l, int c) {
        int nms[][] = new int[l][c];
        int nms2[][] = new int[c][l];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                nms[i][j] = sc.nextInt();
            }
        }

      
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < l; j++) {
            nms2[i][j] = nms[j][i];
            }
        }

        System.out.println("Matriz transporta: ");
        for(int i = 0; i < c; i++){
            for(int j = 0; j < l; j++){
                System.out.print(nms2[i][j] + " ");
            } 
            System.out.println();
        }
        
    }
}
