package Lista1ponto;

import java.util.Scanner;

public class Q6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        corrida(sc.nextInt());
    }

    public static void corrida(int n) {
        if (n == 1) {
            double tempo = sc.nextDouble();
            System.out.println("Melhor tempo: " + tempo);
            System.out.println("Pior tempo: " + tempo);
            System.out.println("Tres melhores tempos:");
            System.out.println(tempo);
            return;
        }

        if (n == 2) {
            double t1 = sc.nextDouble();
            double t2 = sc.nextDouble();

            if (t1 > t2) {
                double aux = t1;
                t1 = t2;
                t2 = aux;
            }

            System.out.println("Melhor tempo: " + t1);
            System.out.println("Pior tempo: " + t2);
            System.out.println("Tres melhores tempos:");
            System.out.println(t1 + " " + t2);
            return;
        }

        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();

        if (m1 > m2) {
            double aux = m1;
            m1 = m2;
            m2 = aux;
        }

        if (m1 > m3) {
            double aux = m1;
            m1 = m3;
            m3 = aux;
        }

        if (m2 > m3) {
            double aux = m2;
            m2 = m3;
            m3 = aux;
        }

        double menor = m1;
        double maior = m3;

        for (int i = 3; i < n; i++) {
            double tempo = sc.nextDouble();

            if (tempo < menor) {
                menor = tempo;
            }

            if (tempo > maior) {
                maior = tempo;
            }

            if (tempo < m1) {
                m3 = m2;
                m2 = m1;
                m1 = tempo;
            } else if (tempo < m2) {
                m3 = m2;
                m2 = tempo;
            } else if (tempo < m3) {
                m3 = tempo;
            }
        }

        System.out.println("Melhor tempo: " + menor);
        System.out.println("Pior tempo: " + maior);
        System.out.println("Tres melhores tempos:");
        System.out.println(m1 + " " + m2 + " " + m3);
    }
}
