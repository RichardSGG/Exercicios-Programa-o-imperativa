package Lista0;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os 3 coeficientes separadamente");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        bskr(a,b,c );
        sc.close();

        
    }
    public static void bskr(double a, double b, double c){
        double delta = (b * b) - (4 * a * c);
        double x;
        double x1;
        double x2;

        if(a == 0){
            System.out.println("Coeficiente não pode ser zero.");
        }
        else if(delta < 0){
            System.out.println("Não há raizes");
        }
        else if(delta == 0){
            x = -b /(2.0 * a);
            System.out.printf("A única raiz é %.2f" , x);
        }
        else if(delta > 0){
            x1 = (- b - Math.sqrt(delta)) / (2.0 * a);
            x2 = (- b + Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("As raizes são %.2f e %.2f", x1, x2);
        }

    }


}
