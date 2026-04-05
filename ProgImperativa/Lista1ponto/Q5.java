    package Lista1ponto;
    import java.util.Scanner;

    public class Q5 {
        static Scanner s = new Scanner(System.in);
        public static void main(String[] args) {
            Fabrica(s.nextInt());
            
        }

    public static void Fabrica(int n){
        int prod[] = new int[n];
        for(int i = 0; i < prod.length; i++){
            prod[i] = s.nextInt();
        }

        int maior = prod[0];
        int menor = prod[0];

        for(int i = 0; i < prod.length; i++){
            if (prod[i] > maior ) {
                maior = prod[i];
            }
            if(prod[i] < menor){
                menor = prod[i];
            }

        }

        
        int md = 0;


        for(int i = 1; i < prod.length ; i++){
            int Diferencaatual = (prod[i] - prod[i-1]);
            if (Diferencaatual > md) {
                md = Diferencaatual;
            }

        }

        
        if (md <= 0) {
                System.out.println("Diferença: " + 0);
            }
        else{
        System.out.println("Maior produção: " + maior);
        System.out.println("Menor produção: " + menor);
        System.out.println("Maior produção: " + md);}
        

    }
    }
