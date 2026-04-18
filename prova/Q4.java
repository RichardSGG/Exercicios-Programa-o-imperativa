package prova;

public class Q4 {       public static void main(String[] args) {
 int[][] x = { {1, 2, 3}, {4, 5, 6} };
 int l = x.length;
 int c = x[0].length;
 int[][] y = new int[ c ][ l ];
 for (int i = 0; i < l; i++) {
 for (int j = 0; j < c; j++) {
 y[j][i] = x[i][j];
 }
 }
 int[][] z = new int[x.length][x.length];
 for (int i = 0; i < x.length; i++) {
 for (int j = 0; j < x.length; j++) {
 z[i][j] = x[i][j] + y[i][j];
 }
 }
 for (int i = 0; i < l; i++) {
 for (int j = 0; j < c; j++) {
 System.out.print("z[i][j]");
 }
 System.out.println();
 }
 }

    }

