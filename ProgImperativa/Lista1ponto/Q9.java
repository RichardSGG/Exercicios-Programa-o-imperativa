package Lista1ponto;
import java.util.Scanner;

public class Q9 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Matriz(sc.nextInt());
    
        
    }

    public static void Matriz(int n){
        int mt[][] = new int[n][n];
        int digp = 0;
        int digs = 0;
        for(int i = 0; i < mt.length; i++){
            for(int j = 0; j < mt.length; j++){
                mt[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i< mt.length;i++){
           digp += mt[i][i];
           digs += mt[i][(n - 1 - i)];
        }

        int total = digp + digs;

        if(n %2 != 0){
            int centro = mt[n/2][n/2];
            total -= centro;

        }
        System.out.println("Soma da diagonal principal: " + digp);
        System.out.println("Soma da diagonal secundária: " + digs);
        System.out.println("Soma total diagonais sem repetir o centro: " + total);

    }
}
