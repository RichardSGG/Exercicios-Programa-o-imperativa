package Lista1ponto;

import java.util.Scanner;

public class Q16 {
    static Scanner p = new Scanner(System.in);

    public static void main(String[] args) {
        ClickBus(p.nextInt());
    }

    public static void ClickBus(int n) {
        int passageiros[][] = new int[n][n];
        int chegadas[] = new int[passageiros[0].length];
        int saidas[] = new int[passageiros[0].length];
        for (int i = 0; i < passageiros.length; i++) {
            for (int j = 0; j < passageiros[0].length; j++) {
                passageiros[i][j] = p.nextInt();
                chegadas[j] += passageiros[i][j];
                saidas[i] += passageiros[i][j];
            }

        }
        String simetrico = "sim";
        for (int i = 0; i < passageiros.length; i++) {
            if(simetrico.equals("nao")) break;
            for (int j = 0; j < passageiros[0].length; j++) {
                if (passageiros[i][j] != passageiros[j][i]) {
                    simetrico = "nao";
                    break;
                }
            }
        }
        int maiordif = 0;
        int dif = 0;
        for (int i = 0; i < passageiros.length; i++) {
            if (maiordif < Math.abs(chegadas[i] - saidas[i])) {
                maiordif = Math.abs(chegadas[i] - saidas[i]);
                dif = i;
            }
        }
        for (int i = 0; i < passageiros.length; i++) {
            System.out.printf("Saidas do terminal %d: %d%n", i, saidas[i]);
        }
        for (int i = 0; i < passageiros.length; i++) {
            System.out.printf("Chegadas no terminal %d: %d%n", i, chegadas[i]);
        }
        System.out.println("Terminal com maior diferenca absoluta entre saidas e chegadas: " + dif);
        System.out.println("Matriz simetrica: " + simetrico);
    }
}
