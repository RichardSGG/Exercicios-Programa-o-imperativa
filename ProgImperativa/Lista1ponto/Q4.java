package Lista1ponto;
import java.util.Scanner;

public class Q4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

    Loja(sc.nextInt());
    
        
    }
    public static void Loja(int n){
    int cods [] = new int[n];
    for(int i = 0; i < cods.length; i++){
        cods[i] = sc.nextInt();
    }
    boolean tem = false;
    int x = sc.nextInt();
    for(int i = 0; i < cods.length; i++){
    if (cods[i] == x) {
    System.out.println("Codigo encontrado");
    System.out.println("Primeira posição: " + i);
    tem = true;
    break;
    }

    }

    if (tem == false) {
        System.out.println("Código não encontrado");
        
    }

    }
}


