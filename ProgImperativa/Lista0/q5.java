package Lista0;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o ano da vacinaÃ§Ã£o e o tempo");
    int ano = sc.nextInt();
    int tempo = sc.nextInt();
    Vac(ano,tempo);
    sc.close();
        
    }

    public static void Vac(int ano,int tempo){

        if(tempo <= 0){
            System.out.println("Digite um perÃ­odo maior que zero");
        }
        else {

            for(int i=0; i <=3; i++){
            int doses = ano + (i * tempo);
            System.out.printf("%d\t" , doses);
            
            }
        }


}
}
