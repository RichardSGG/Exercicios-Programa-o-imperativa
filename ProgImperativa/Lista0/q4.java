package Lista0;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Descubra seu signo, para isso, digite sua data de nascimento");
        System.out.println("Digite o Dia");
        int dia = sc.nextInt();
        System.out.println("Digite o MÃªs");
        int mes = sc.nextInt();
        System.out.println("Digite o Ano");
        int ano = sc.nextInt();
        Signo(dia, mes, ano);
        sc.close();
    }

    public static void Signo(int dia, int mes, int ano) {
        boolean bisexto = false;
        int maxdias = 0;

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    bisexto = true;
                } else {
                    bisexto = false;
                }
            } else {
                bisexto = true;
            }
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            maxdias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            maxdias = 30;
        } else if (mes == 2) {
            if (bisexto) maxdias = 29;
            else maxdias = 28;
        }
        if (mes < 1 || mes > 12 || dia < 1 || dia > maxdias) {
            System.out.print("Data Invalida");
            return;
        }

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.print("Aries");
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            System.out.print("Touro");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 21)) {
            System.out.print("Gemeos");
        } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) {
            System.out.print("Cancer");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            System.out.print("Leao");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.print("Virgem");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.print("Libra");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.print("Escorpiao");
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            System.out.print("Sagitario");
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.print("Capricornio");
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            System.out.print("Aquario");
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            System.out.print("Peixes");
        }
    }
}
