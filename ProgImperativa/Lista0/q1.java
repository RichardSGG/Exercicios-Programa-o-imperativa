package Lista0;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o volume");
        int volume = sc.nextInt();
        Vol(volume);
        sc.close();
        
    }

    public static void Vol(int volume){
       
        if(volume <= 0){
            System.out.println("Min volume");
        }
        else if(volume >0 && volume <= 25){
            System.out.println("Low volume");
        }
        else if(volume <25 && volume <=75){
            System.out.println("Medium volume");
        }
        else if(volume > 75 && volume <=100){
            System.out.println("High volume");
        }
        else{
            System.out.println("Max Volume");
        }



    }
}
