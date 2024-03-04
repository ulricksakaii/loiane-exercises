package Exercicios01;
import java.util.Scanner;
import java.lang.Math;
public class Areacirculo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Me dê o valor do raio do círculo... ");
        Double raio = scan.nextDouble();

        Double area = Math.PI * (Math.pow(raio, 2));

        System.out.println(String.format("A área do círculo é igual á: %.2f",  area));

        System.out.println(String.format("O dobro da área do círculo é igual a %.2f", (area * 2)));
    }
}
