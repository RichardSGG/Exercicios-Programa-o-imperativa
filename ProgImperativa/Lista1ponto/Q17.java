package Lista1ponto;

import java.util.Scanner;

public class Q17 {
    static Scanner banco = new Scanner(System.in);

    public static void main(String[] args) {
        Caixa(banco.nextInt(), banco.nextInt());

    }

    public static void Caixa(int l, int c) {
        int valores[][] = new int[l][c];
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[0].length; j++) {
                valores[i][j] = banco.nextInt();
                

            }
        }
        int somal = 0;
        int somala = 0;
        int somac = 0;
        int somaca = 0;
        int linha = 0;
        int coluna = 0;

        for(int i = 0; i < valores.length; i++){
            for(int j = 0;j < valores[0].length;j++){
                somala += valores[i][j];
                if(somala> somal){
                somal = somala;
                linha = i;
                }
                if(somala < 0){
                somala = 0;
                }
            }
            somala = 0;
        }

        for(int j = 0;j < c;j++){
            somaca = 0 ;
            for(int i = 0; i < l; i++){
                somaca += valores[i][j];
                if(somaca > somac){
                    somac = somaca;
                    coluna = j;
                }
                if(somaca < 0){
                    somaca = 0;
                }
            }
        }
    
        

        

        

        System.out.println("Maior soma contigua em linha: " + somal);
        System.out.println("Linha da maior soma contigua: " + linha);
        System.out.println("Maior soma contigua em coluna: " + somac);
        System.out.println("Coluna da maior soma contigua: " + coluna);

    }
}

// linha == agencia
// coluna == dia
