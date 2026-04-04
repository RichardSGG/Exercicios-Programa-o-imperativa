package Lista1ponto;
import java.util.Scanner;
public class q3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

    Prices(sc.nextInt());
    
        
    }

    public static void Prices(int n){
    double valores[] = new double[n];
    int soma1 = 0;
    int soma2 = 0;

    for(int i = 0; i < valores.length; i++){
        valores[i] = sc.nextDouble();
        soma1 += valores[i];
    }
    
    double ajuste = sc.nextDouble();
    ajuste = ajuste / 100;

    System.out.println("Novos preços");

    for(int j = 0; j < valores.length; j++){
        valores[j] *= (1 + ajuste);
        soma2 += valores[j];
        System.out.printf("%.2f%n", valores[j]);
    }
    System.out.println("Total antes do reajuste: " + soma1);
    System.out.println("Total depois do reajuste: " + soma2);



    }



}
