package outros;
// matriz com função
import java.util.Scanner;
public class Matriz33{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();

       int [][] have = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

         Tem(x, have);
         System.out.println(Tem(x,have));
    
    }

    public static Boolean Tem(int x, int have[][]){
        for(int i = 0; i < have.length; i++){
            for(int j =  0; j < 3; j++){
                if (have[i][j] ==x ){
                    return true;
                }
            }
            
        }
        return false;
        
    }

    
    
}


