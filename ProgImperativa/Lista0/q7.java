package Lista0;
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor do lado n \n");
    int ladon = sc.nextInt();
    Ast(ladon);
        
    }

    public static void Ast(int ladon){
        if (ladon < 1 || ladon > 20) {
            System.out.println("Erro, lado menor que 1 ou maior que 20");
        }
        else{
                
                for(int i=0; i < ladon; i++){
                    for(int j = 0; j < ladon; j++){
                    System.out.println("*");
                    }
                 System.out.println();
                }
        }

    }
}
