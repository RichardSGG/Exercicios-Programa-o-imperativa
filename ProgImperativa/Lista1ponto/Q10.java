package Lista1ponto;
import java.util.Scanner;

public class Q10 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Esta(sc.nextInt(), sc.nextInt());
  }

  public static void Esta(int l, int c) {
    int[][] dias = new int[l][c];
    int[] linhas = new int[l];
    int[] colunas = new int[c];

    for (int i = 0; i < l; i++) {
      for (int j = 0; j < c; j++) {
        dias[i][j] = sc.nextInt();
        linhas[i] += dias[i][j];
        colunas[j] += dias[i][j];
      }
    }
    int maiorl = 0;
    for (int i = 0; i < l; i++) {
      if (linhas[maiorl] < linhas[i]) {
        maiorl = i;
      }
    }
    int maiorc = 0;
    for (int i = 0; i < c; i++) {
      if (colunas[maiorc] < colunas[i]) {
        maiorc = i;
      }
    }

    for (int i = 0; i < l; i++) {
      System.out.printf("Soma da Linha %d: %d%n", i, linhas[i]);
    }

    for (int i = 0; i < c; i++) {
      System.out.printf("Soma da Coluna %d: %d%n", i, colunas[i]);
    }
    System.out.println("Linha com a maior soma: " + maiorl);
    System.out.println("Coluna com a maior soma: " + maiorc);

  }
}
