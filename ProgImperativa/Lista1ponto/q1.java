package Lista1ponto;
import java.util.Scanner;

public class q1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

    int d = sc.nextInt();
    Consumo(d);
        
       
    }

    public static void Consumo(int d){
        double [] dias = new double[d];
        int consumototal = 0;
        for(int i = 0; i < dias.length; i++){
            dias[i] = sc.nextInt();
            consumototal += dias[i];
        }
        double consumomedio = (double)consumototal/d;


        int contador = 0;

        for(int j = 0; j < dias.length; j++){
            if (dias[j] > consumomedio){
                contador ++;
            }

        }


        System.out.println("Consumo Total: " + consumototal);
        System.out.println("Consumo Médio: " + consumomedio);
        System.out.println("Dias acima da média:  " + contador);
       
}
    
}





